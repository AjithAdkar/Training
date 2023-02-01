package com.example.training.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.training.module.Department;
import com.example.training.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository departmentRepository;

	public Department getDepartmentById(Long id) {
		return departmentRepository.findById(id).get();
	}

	public List<Department> getAllDepartment() {
		List<Department> department = new ArrayList<Department>();
		departmentRepository.findAll().forEach(department::add);
		return department;
	}

	public void delete(Long id) {
		departmentRepository.deleteById(id);
	}

	public Department addDepartment(Department department) {
		return departmentRepository.save(department);
	}

	public Department updateDepartment(Department department) {
		return departmentRepository.save(department);
	}

}
