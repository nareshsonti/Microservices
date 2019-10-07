package com.docker.employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@GetMapping(value = "/getEmpResults")
	public ResponseEntity<Employee> getEmpResults() {
		Employee e = new Employee();
		e.setEmpId(540);
		e.setEmpName("Naresh");
		e.setDept("IT");
		e.setEmpSal("5000");
		return new ResponseEntity<Employee>(e, HttpStatus.OK);
	}

}
