package com.service.service;

import com.google.common.collect.ImmutableSet;
import com.service.questionnaire.Option;
import com.service.questionnaire.Question;
import com.service.vendor.Vendor;
import com.service.vendor.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//@RequestMapping(path = "/services")
public class ServiceController {

    /*@Autowired
    private ServiceRepository serviceRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Service> findAll() {

        return serviceRepository.findAll();
    }

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    @ResponseBody
    public Service findById(@PathVariable("id") long id) {
        return serviceRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Service saveVendor(@RequestBody Service service) {
        return serviceRepository.save(service);
    }

    @RequestMapping(path = "/search", method = RequestMethod.GET)
    @ResponseBody
    public List<Service> findByName(@RequestParam("name") String name) {
        return serviceRepository.findByName(name);
    }*/
}
