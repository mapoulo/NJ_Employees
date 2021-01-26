package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Models.Employee;
import com.example.demo.Repo.Repo;

@org.springframework.stereotype.Service
public class MyService {
	
	@Autowired
	private Repo repo;

	public void saveEmployee(Employee employee) {
		repo.save(employee);
		
	}

	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		repo.findAll().forEach(employees::add);
		return employees;
	}

	public Employee findEmployeeById(int id) {
		return repo.findEmployeeById(id);
		
	}

	public void deleteEmployeeById(int id) {
		repo.deleteById(id);
		
	}

}
