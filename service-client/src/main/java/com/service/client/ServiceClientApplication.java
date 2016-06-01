package com.service.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
public class ServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceClientApplication.class, args);
	}
}

@Configuration
class config {
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

@RequestMapping("/questions")
@RestController
class QuestionsApiGatewayRestController {

	@Autowired
	private RestTemplate restTemplate;

	public Collection<String> questionNamesFallBack() {
		return new ArrayList<>();
	}

	@HystrixCommand(fallbackMethod = "questionNamesFallBack")
	@RequestMapping(value = "/names", method = RequestMethod.GET)
	public Collection<String> questionNames() {
		ParameterizedTypeReference<Resources<Question>> ptr =
				new ParameterizedTypeReference<Resources<Question>>() {
				};
		return restTemplate
				.exchange("http://all-service/questions", HttpMethod.GET, null, ptr)
				.getBody()
				.getContent()
				.stream()
				.map(Question::getName)
				.collect(Collectors.toList());
	}

}

@RequestMapping("/services")
@RestController
class ServicesApiGatewayRestController {

	@Autowired
	private RestTemplate restTemplate;

	public Collection<String> serviceNamesFallBack() {
		return new ArrayList<>();
	}

	@HystrixCommand(fallbackMethod = "serviceNamesFallBack")
	@RequestMapping(value = "/names", method = RequestMethod.GET)
	public Collection<String> serviceNames() {
		ParameterizedTypeReference<Resources<Service>> ptr =
				new ParameterizedTypeReference<Resources<Service>>() {
				};
		return restTemplate
				.exchange("http://all-service/services", HttpMethod.GET, null, ptr)
				.getBody()
				.getContent()
				.stream()
				.map(Service::getName)
				.collect(Collectors.toList());
	}

}

@Data
class Service {

	private String name;
}

@Data
class Question {

	private String name;
}