package com.iamgovindthakur.interceptor.controller;

import com.iamgovindthakur.interceptor.exception.CustomerNotFoundException;
import com.iamgovindthakur.interceptor.model.Customer;
import com.iamgovindthakur.interceptor.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/")
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Homepage", HttpStatus.ACCEPTED);
    }

    @GetMapping("/customer")
    public ResponseEntity<List<Customer>> getAllUser() {
        List<Customer> customerList = customerRepository.findAll();
        return new ResponseEntity<>(customerList, HttpStatus.ACCEPTED);
    }

    @GetMapping("/customer/{nameContains}")
    public ResponseEntity<List<Customer>> getCustomerByFirstName(@PathVariable String nameContains) {
        List<Customer> customerList = customerRepository.findByfNameContaining(nameContains);
        if (!customerList.isEmpty())
            return new ResponseEntity<>(customerList, HttpStatus.ACCEPTED);
        throw new CustomerNotFoundException("There is no Customer with name contains: " + nameContains);
    }
}
