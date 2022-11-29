package com.voterdata.controller;

import com.voterdata.model.PersonModel;
import com.voterdata.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    PersonService service;


    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Voter";
    }

    @GetMapping("/info")
    public List<PersonModel> getPersonData(){
        return service.getPersonInfo();
    }

}
