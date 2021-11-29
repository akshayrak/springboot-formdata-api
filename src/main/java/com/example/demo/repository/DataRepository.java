package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Req;

public interface DataRepository extends CrudRepository<Req, Integer>  {

}
