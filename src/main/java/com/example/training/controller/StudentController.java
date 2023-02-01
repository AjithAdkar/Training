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
//import com.example.training.module.Student;
//import com.example.training.service.StudentService;
//
//@RestController
//public class StudentController {
//	
//	@Autowired
//	StudentService studentService;
//	
//	 @GetMapping("/student/{id}")
//	  public Student getStudent(@PathVariable("id") Long id) {
//		 return studentService.getStudentById(id);
//	 }
//	 
//	 @GetMapping("/student")
//		private List<Student> getAllStudent() {
//			return studentService.getAllStudent();
//		}
//	 @DeleteMapping("/student/{id}")
//        public void student(@PathVariable ("id") Long id) {
//		 studentService.delete(id);
//	 }
//	 
//	 @PostMapping("/student")
//		private Student addStudent(@RequestBody Student student) {
//			return this.studentService.addStudent(student);
//		}
//		
//	 @PutMapping("/student/{id}")
//		private Student updateStudent(@RequestBody Student student) {
//			return studentService.updateStudent(student);
//	 }
//}
