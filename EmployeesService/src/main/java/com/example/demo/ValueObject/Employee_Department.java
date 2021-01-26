package com.example.demo.ValueObject;

import com.example.demo.Models.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee_Department {
	
	public Employee_Department() {}
	
   private Employee employee;
   private Department department;
}
