package com.example.ramazone.controller;

import com.example.ramazone.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/clrp/customer")
public class CustomerController {

        @Autowired
        public CustomerService customerService;

        @GetMapping(value = {"/list"})
        public ModelAndView displayAllCustomers(){
            var modelAndView = new ModelAndView();
            modelAndView.addObject("customers",customerService.getplantinumhonoredcustomers());
            modelAndView.setViewName("customerList");
            return modelAndView;
        }


    }


