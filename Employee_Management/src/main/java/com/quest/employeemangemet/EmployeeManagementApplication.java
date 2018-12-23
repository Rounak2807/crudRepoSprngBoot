package com.quest.employeemangemet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.quest.employeemangemet.dao.EmployeeDao;
import com.quest.employeemangemet.entity.EmployeeEntity;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner {
    
	@Autowired
	private EmployeeDao employeeDao;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 
		EmployeeEntity employeeEntity=new EmployeeEntity();
		employeeEntity.setEmpId(1);
		employeeEntity.setEmpName("dempEmployee");
		employeeDao.save(employeeEntity);
		
	}

}

