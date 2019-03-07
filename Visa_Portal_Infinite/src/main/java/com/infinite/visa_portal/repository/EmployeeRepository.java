package com.infinite.visa_portal.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infinite.visa_portal.entity.Employee;

@Repository
@Transactional
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	
}
