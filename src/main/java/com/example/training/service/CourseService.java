package com.example.training.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.training.module.Course;
import com.example.training.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	CourseRepository courseRepositery;

	// to fetch single record by id
	public Course getCourseById(Long id) {
		return courseRepositery.findById(id).get();
	}

	public List<Course> getAllCourse() {
		List<Course> course = new ArrayList<Course>();
		courseRepositery.findAll().forEach(course::add);
		return course;
	}

	public void delete(Long id) {
		courseRepositery.deleteById(id);
	}

	public Course addCourse(Course course) {
		return courseRepositery.save(course);
	}

	public Course updateCourse(Course course) {
		return courseRepositery.save(course);
	}
}
