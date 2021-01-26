package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Employee;

public interface Repo extends JpaRepository<Employee, Integer> {

	Employee findEmployeeById(int id);

}
