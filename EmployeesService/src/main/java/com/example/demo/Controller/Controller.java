package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Models.Employee;
import com.example.demo.Service.MyService;
import com.example.demo.ValueObject.Department;
import com.example.demo.ValueObject.Employee_Department;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/employees")
public class Controller {
	
	@Autowired
	private MyService service;
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/")
	public String saveEmployee(@RequestBody Employee employee) {
		log.info("Insid the saveEmployee method of the EmployeeService controller ");
		service.saveEmployee(employee);
		return "The employee is saved successfuly";
	}
	
	@GetMapping("/")
	public List<Employee> getAllEmployees(){
		log.info("Insid the getAllEmployees method of the EmployeeService controller ");

		return service.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public Employee_Department getEmployeeById(@PathVariable int id) {
		log.info("Insid the getEmployeeById method of the EmployeeService controller ");
        Employee_Department employee_Department = new Employee_Department();
        Employee employee = service.findEmployeeById(id);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+id, Department.class);;
        employee_Department.setDepartment(department);
        employee_Department.setEmployee(employee);        
        return employee_Department;
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		log.info("Insid the deleteEmployeeById method of the EmployeeService controller ");

		service.deleteEmployeeById(id);
		return "The employee with id "+ id+" is deleted successuly";
	}

}
