package com.quest.employeemangemet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quest.employeemangemet.dao.EmployeeDao;
import com.quest.employeemangemet.entity.EmployeeEntity;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	public String getString() {
		// TODO Auto-generated method stub
		return "checkng";
	}

	public Iterable<EmployeeEntity> getAllEmployee() {
		return employeeDao.findAll();
	}

}
