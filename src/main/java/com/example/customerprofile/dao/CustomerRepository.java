package com.example.customerprofile.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.customerprofile.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
