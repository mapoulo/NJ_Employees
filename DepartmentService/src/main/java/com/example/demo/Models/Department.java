package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int DepartmentId;
	
	private String DepartmentName;

}
