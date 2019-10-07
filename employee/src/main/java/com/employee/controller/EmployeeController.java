package com.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping(value = "/getEmpDetails")
	public String getEmpDetails() {
		return "Employee Details";
	}

	@GetMapping(value = "/getMessage")
	public String getMessage() {
		return "getMessage()---------";
	}
}
