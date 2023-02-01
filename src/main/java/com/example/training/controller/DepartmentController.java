package com.example.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.training.module.Department;
import com.example.training.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	 @GetMapping("/department/{id}")
	  public Department getDepartment(@PathVariable("id") Long id) {
		 return departmentService.getDepartmentById(id);
	 }
	 
	 @GetMapping("/department")
		private List<Department> getAllCourse() {
			return departmentService.getAllDepartment();
		}
	 @DeleteMapping("/department/{id}")
        public void department(@PathVariable ("id") Long id) {
		 departmentService.delete(id);
	 }
	 
	 @PostMapping("/department")
		private Department addCourse(@RequestBody Department department) {
			return this.departmentService.addDepartment(department);
		}
		
	 @PutMapping("/department/{department_id}")
		private Department updateCourse(@RequestBody Department department) {
			return departmentService.updateDepartment(department);
		}
	
}
