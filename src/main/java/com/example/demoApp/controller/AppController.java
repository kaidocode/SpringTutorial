package com.example.demoApp.controller;

import com.example.demoApp.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;


@Controller
public class AppController {

    Person person1 = new Person(1L,"Kaido",19);
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("peoples", Arrays.asList(
                new Person(1L,"Kaido",19),
                new Person(2L,"Ahmed",38),
                new Person(3L,"Ali",27)
        ));
        return "homePage";
    }
}
