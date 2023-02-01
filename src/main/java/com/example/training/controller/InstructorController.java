//package com.example.training.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import com.example.training.module.Instructor;
//import com.example.training.service.InstructorService;
//
//@RestController
//public class InstructorController {
//	@Autowired
//	InstructorService instructorService;
//	
//	 @GetMapping("/instructor/{id}")
//	  public Instructor getInstructor(@PathVariable("id") Long id) {
//		 return instructorService.getInstructorById(id);
//	 }
//	 
//	 @GetMapping("/instructor")
//		private List<Instructor> getAllCourse() {
//			return instructorService.getAllCourse();
//		}
//	 @DeleteMapping("/instructor/{instructor_id}")
//        public void instructor(@PathVariable ("instructor_id") Long instructor_id) {
//		 instructorService.delete(instructor_id);
//	 }
//	 
//	 @PostMapping("/instructor")
//		private Instructor addCourse(@RequestBody Instructor instructor) {
//			return this.instructorService.addCourse(instructor);
//		}
//		
//	 @PutMapping("/instructor/{id}")
//		private Instructor updateCourse(@RequestBody Instructor instructor) {
//			return instructorService.updateCourse(instructor);
//		}
//}
