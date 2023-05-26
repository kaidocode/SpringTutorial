package com.example.demoApp.controller;

import com.example.demoApp.data.PersonImplService;
import com.example.demoApp.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {

    @Autowired
    PersonImplService service = new PersonImplService();

    @GetMapping("api/user")
    public List<Person> getPersonList(){
        List<Person> personList = service.findAll();
        return personList;
    }
}
