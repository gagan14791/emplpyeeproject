package com.myemployee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myemployee.model.Employee;
import com.myemployee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee()
	{
		return employeeRepository.findAll();
	}
	
	
	public Employee createNewEmployee(Employee employee){
		
		employeeRepository.save(employee);
		return employee;
	}
	
}




