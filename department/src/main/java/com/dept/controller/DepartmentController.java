package com.dept.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	@GetMapping(value="/getDeptDetails")
	public String getEmpDetails() {
		return "Department Details";
	}

}
