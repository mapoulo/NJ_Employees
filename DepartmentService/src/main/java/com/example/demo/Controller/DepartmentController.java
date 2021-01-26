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

import com.example.demo.Models.Department;
import com.example.demo.Service.MyService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private MyService myService;
	
	@PostMapping("/")
	public String  saveDepartment(@RequestBody Department department) {
		log.info("Insid the saveDepartment method of the Department Controller ");
		myService.saveDepartment(department);
		 return "The department is saved successfuly :)";
	}
	
	@GetMapping("/")
	public List<Department>  getAllDepartment(){
		log.info("Insid the getAllDepartment method of the Department Controller ");

		return myService.getAllDepartment();
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable int id) {
		log.info("Insid the findDepartmentById method of the Department Controller ");

		return myService.findDepartmentById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteDepartment(@PathVariable int id) {
		log.info("Insid the deleteDepartment method of the Department Controller ");

		myService.deleteDepartment(id);
		return "Department deleted successfuly";
	}

}
