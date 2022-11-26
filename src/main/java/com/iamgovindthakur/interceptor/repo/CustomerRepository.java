package com.iamgovindthakur.interceptor.repo;


import com.iamgovindthakur.interceptor.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {


    List<Customer> findByfNameContaining(String nameContains);
}
