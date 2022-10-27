package com.example.ramazone.service;


import com.example.ramazone.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<Customer> getplantinumhonoredcustomers();
}
