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

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private MyService myService;
	
	@PostMapping("/save")
	public Department saveDepartment(@RequestBody Department department) {
		return myService.saveDepartment(department);
	}
	
	@GetMapping("/")
	public List<Department>  getAllDepartment(){
		return myService.getAllDepartment();
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable int id) {
		return myService.findDepartmentById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteDepartment(@PathVariable int id) {
		myService.deleteDepartment(id);
		return "Department deleted successfuly";
	}

}
