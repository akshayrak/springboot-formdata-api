package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Customer;

public interface CusotmerRepository extends CrudRepository<Customer, Integer> {

}
