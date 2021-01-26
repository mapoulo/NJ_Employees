package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Department;
import com.example.demo.Service.MyService;

@RestController
public class DepartmentController {
	
	@Autowired
	private MyService myService;
	
	
	public Department saveDepartment(Department department) {
		return myService.saveDepartment(department);
	}
	
	public List<Department>  getAllDepartment(){
		return myService.getAllDepartment();
	}
	
	public Department findDepartmentById(int id) {
		return myService.findDepartmentById(id);
	}
	
	public String deleteDepartment(int id) {
		myService.deleteDepartment(id);
		return "Department deleted successfuly";
	}

}
