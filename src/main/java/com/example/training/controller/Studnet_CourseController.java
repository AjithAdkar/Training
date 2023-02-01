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
//
//import com.example.training.module.Student_Course;
//import com.example.training.service.Student_CourseService;
//@RestController
//public class Studnet_CourseController {
//@Autowired
//Student_CourseService student_CourseService;
//	
//	@GetMapping("/student_course/{id}")
//	  public Student_Course getStudent_Course(@PathVariable("id") Long id) {
//		 return student_CourseService.getStudent_CourseById(id);
//	 }
//	 
//	 @GetMapping("/student_course")
//		private List<Student_Course> getAllStudent_Course() {
//			return student_CourseService.getAllStudent_Course();
//		}
//	 @DeleteMapping("/student_course/{id}")
//    public void delete(@PathVariable ("id") Long id) {
//		 student_CourseService.delete(id);
//	 }
//	 
//	 @PostMapping("/student_course")
//		private Student_Course addStudent_Course(@RequestBody Student_Course student_course) {
//			return this.student_CourseService.addStudent_Course(student_course);
//		}
//		
//	 @PutMapping("/student_course")
//		private Student_Course updateSemester(@RequestBody Student_Course student_course) {
//			return student_CourseService.updateStudent_Course(student_course);
//		}
//}
