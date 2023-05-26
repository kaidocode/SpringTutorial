package com.example.demoApp.controller;

import com.example.demoApp.data.PersonImplService;
import com.example.demoApp.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;


@Controller
public class AppController {

    @Autowired
    PersonImplService service = new PersonImplService();
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/user/all")
    public String home(Model model){
        List<Person> personList = service.findAll();
        model.addAttribute("peoples", personList);
        return "homePage";
    }
}
