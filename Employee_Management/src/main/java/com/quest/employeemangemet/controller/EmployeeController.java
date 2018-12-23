package com.quest.employeemangemet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quest.employeemangemet.entity.EmployeeEntity;
import com.quest.employeemangemet.service.EmployeeService;

@RestController
public class EmployeeController {
	  
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/api/demo")
	 public String demoapplication() {
		return employeeService.getString();
	}
	
	@GetMapping("/findAll")
	public Iterable<EmployeeEntity> findAllEmployee() {
		return employeeService.getAllEmployee();
	}
	 

}
