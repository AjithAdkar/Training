package com.example.training.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.training.module.Student;
import com.example.training.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;

	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	public List<Student> getAllStudent() {
		List<Student> student = new ArrayList<Student>();
		studentRepository.findAll().forEach(student::add);
		return student;
	}

	public void delete(Long id) {
		studentRepository.deleteById(id);
	}

	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

}
