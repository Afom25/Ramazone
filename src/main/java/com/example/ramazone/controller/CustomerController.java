package com.example.ramazone.controller;

import com.example.ramazone.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class CustomerController {

    @Controller
    @RequestMapping(value="/clrp/customer")
    public class Customerontroller {

        @Autowired
        public CustomerService customerService;

        @GetMapping(value = {"/list"})
        public ModelAndView displayAllCustomers(){
            var modelAndView = new ModelAndView();
            modelAndView.addObject("patients",customerService.getplantinumhonoredcustomers());
            modelAndView.setViewName("list");
            return modelAndView;
        }


    }

}
