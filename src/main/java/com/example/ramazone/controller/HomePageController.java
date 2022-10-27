package com.example.ramazone.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value= { "","/home","/clrp/home"})
public class HomePageController {


    @GetMapping({"","/clrp/home","/"})
    public String displayhomepage(){
        return "index";
    }
}
