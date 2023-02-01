//package com.example.training.controller;
//
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import com.example.training.module.Course;
//import com.example.training.service.CourseService;
//
//@RestController
//public class CourseController {
//	
//	@Autowired
//	CourseService courseService;
//	
//	@GetMapping("/course/{courseid}")
// private Course getCourse(@PathVariable("courseid") Long courseid) {
//		return courseService.getCourseById(courseid);
//	}
//	
//	@GetMapping("/course")
//	private List<Course> getAllCourse() {
//		return courseService.getAllCourse();
//	}
//	
//	@DeleteMapping("/course/{courseid}")
//    public void delete(@PathVariable ("courseid") Long courseid) {
//    courseService.delete(courseid);
//	}
//	
//	@PostMapping("/course")
//	private Course addCourse(@RequestBody Course course) {
//		return this.courseService.addCourse(course);
//	}
//	
//	@PutMapping("/course/{courseid}")
//	private Course updateCourse(@RequestBody Course course) {
//		return courseService.updateCourse(course);
//	}
//}
