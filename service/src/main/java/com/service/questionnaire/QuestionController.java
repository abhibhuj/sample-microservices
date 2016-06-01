package com.service.questionnaire;

import com.google.common.collect.ImmutableSet;
import com.service.service.Service;
import com.service.service.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

/**
 * Created by bhujabaa on 3/15/2016.
 */
//@Controller
//@RequestMapping(path = "/questions")
public class QuestionController {

    /*@Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private ServiceRepository serviceRepository;

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    @ResponseBody
    public Question findById(@PathVariable("id") long id) {

        return questionRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Question saveQuestion(@RequestBody Question question) {

        return questionRepository.save(question);
    }

    @RequestMapping(path = "/search", method = RequestMethod.GET)
    @ResponseBody
    public List<Question> findByService(@RequestParam("serviceId") Long serviceId) {

        return questionRepository.findByServiceId(serviceId);
    }*/
}
