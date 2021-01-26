package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Department;
import com.example.demo.Repository.Repo;

@Service
public class MyService {
	
	
	@Autowired
	private Repo repo;
	
	
	public Department saveDepartment(Department department) {
		return repo.save(department);
	}
	
	public List<Department>  getAllDepartment(){
		List<Department> departments = new ArrayList<>();
		repo.findAll().forEach(departments::add);
		return departments;
	}
	
	public Department findDepartmentById(int id) {
		return repo.findDepartmentById(id);
	}
	
	public void deleteDepartment(int id) {
		repo.deleteById(id);
	}

}
