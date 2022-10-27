package com.example.ramazone.repository;


import com.example.ramazone.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    @Query(value = "select s from Customer s where s.numberOfRewardPointsEarned >= 1000")
    List<Customer> getAccountBalance(String balance);


}

