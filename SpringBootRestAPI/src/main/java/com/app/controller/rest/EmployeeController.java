package com.app.controller.rest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.modal.Employee;

@RestController
public class EmployeeController {
	@GetMapping("/showA")
	public String showA() 
	{
		return "Hello-String";
	}
	@GetMapping("/showB")
	public Employee showB() 
	{
		return new Employee(22, "Ismail", 3.8);
	}
	@GetMapping("/showC")
	public List<Employee> showC() 
	{
		return Arrays.asList(new Employee(22, "Amjad", 6.8),
							 new Employee(23, "Farhan", 6.8),
							 new Employee(24, "Rashid", 6.8)
							);
	}
	@GetMapping("/showD")
	public Map<String, Employee> showD() 
	{
		Map<String, Employee> map=new HashMap<>();
		map.put("e1", new Employee(22, "Kalam", 4.6));
		map.put("e2", new Employee(23, "Ahmed", 8.2));
		map.put("e3", new Employee(24, "Sahil", 9.5));
		return map;
	}
	@GetMapping("/showE")
	public ResponseEntity<String> showE() 
	{
		ResponseEntity<String> resp=new ResponseEntity<>("Hello RE",HttpStatus.OK);
		return resp;
	}
}
