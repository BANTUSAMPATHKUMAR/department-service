package com.department.manage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.manage.domain.Department;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {

	@GetMapping("/getDepartment")
	public Department getDepartment() {
		Department department = new Department();
		department.setDepartmentId(124);
		department.setDescription("Software Company😊❤️");
		department.setName("TCS");
		return department;
	}

}
