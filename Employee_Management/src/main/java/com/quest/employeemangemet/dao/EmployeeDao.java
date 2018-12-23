package com.quest.employeemangemet.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quest.employeemangemet.entity.EmployeeEntity;

@Repository
public interface EmployeeDao extends CrudRepository<EmployeeEntity, Integer> {

	 

}
