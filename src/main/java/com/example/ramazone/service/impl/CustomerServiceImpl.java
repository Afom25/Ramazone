package com.example.ramazone.service.impl;

import com.example.ramazone.model.Customer;
import com.example.ramazone.repository.CustomerRepository;
import com.example.ramazone.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository  customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository patientRepository){
        this.customerRepository = patientRepository;
    }
    @Override
    public List<Customer> getplantinumhonoredcustomers() {
        return customerRepository.findAll(Sort.by(Sort.Direction.DESC,"numberOfRewardPointsEarned"));
    }


    public List<Customer> getAccountBalance(String prime)
    {
        return customerRepository.getAccountBalance(prime);
    }




    }




