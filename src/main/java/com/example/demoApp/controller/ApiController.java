package com.example.demoApp.controller;

import com.example.demoApp.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {
    List<Person> personList = new ArrayList<Person>();
    @GetMapping("api/user")
    public List<Person> getPersonList(){
        Person p1 = new Person(1L, "Ahmed", 31);
        Person p2 = new Person(2L, "Sara", 8);
        Person p3 = new Person(45L, "Ali", 13);
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        return personList;
    }
}
