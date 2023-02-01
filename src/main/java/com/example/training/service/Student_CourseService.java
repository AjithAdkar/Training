package com.example.training.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.training.module.Student_Course;
import com.example.training.repository.Student_CourseRepository;

@Service
public class Student_CourseService {
	
	@Autowired
	Student_CourseRepository student_CourseRepository;
	
	 public Student_Course getStudent_CourseById(Long id) {
		 return student_CourseRepository.findById(id).get();
	 }

	 public List<Student_Course> getAllStudent_Course() {
			List<Student_Course> student_Course=new ArrayList<Student_Course>();
			student_CourseRepository.findAll().forEach(student_Course::add);
			return student_Course;
	 }
	 
	 public void delete(Long id) {
		 student_CourseRepository.deleteById(id); 
	 }
	 
	 public Student_Course addStudent_Course(Student_Course student_course) {
		 return student_CourseRepository.save(student_course);
	 }
	 
	 public Student_Course updateStudent_Course(Student_Course student_course) {
		 return student_CourseRepository.save(student_course);
	 }

}
