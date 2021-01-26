package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Models.Department;

public interface Repo extends CrudRepository<Department, Integer> {

}
