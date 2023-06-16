package com.myemployee.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myemployee.model.Employee;
import com.myemployee.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees()
	{
		return employeeServiceImpl.getAllEmployee();
	}
	
	
	@PostMapping("/addNewEmployee")
	public Employee createNewFlight(@RequestBody Employee employee)
	{
		employeeServiceImpl.createNewEmployee(employee);
		return employee;	
	}

}
