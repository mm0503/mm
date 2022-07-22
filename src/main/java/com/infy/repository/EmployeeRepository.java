package com.infy.repository;

import org.springframework.data.repository.CrudRepository;


import com.infy.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

}
