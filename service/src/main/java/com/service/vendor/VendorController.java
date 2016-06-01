package com.service.vendor;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.service.questionnaire.Option;
import com.service.questionnaire.Question;
import com.service.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bhujabaa on 3/20/2016.
 */
//@Controller
//@RequestMapping(path = "/vendors")
public class VendorController {

    /*@Autowired
    private VendorRepository vendorRepository;

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    @ResponseBody
    public Vendor findById(@PathVariable("id") long id) {

        return vendorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Vendor saveVendor(@RequestBody Vendor vendor) {

        return vendorRepository.save(vendor);
    }

    @RequestMapping(path = "/search", method = RequestMethod.GET)
    @ResponseBody
    public List<Vendor> findByName(@RequestParam("name") String name) {

        return vendorRepository.findByName(name);
    }*/
}
