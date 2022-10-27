package com.example.ramazone.controller;

import com.example.ramazone.model.Customer;
import com.example.ramazone.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/clrp/api/customer/plantinumhonors/")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/listall")
    public List<Customer> displayAllplantium(){
        return customerService.getplantinumhonoredcustomers();
    }


    @GetMapping("/list")
    public List<Customer> getAccountBalance(String prime){
        return customerService.getAccountBalance(prime);
    }




}

