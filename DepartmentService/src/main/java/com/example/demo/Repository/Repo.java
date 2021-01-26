package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Department;

public interface Repo extends JpaRepository<Department, Integer> {

	Department findDepartmentById(int id);


}
