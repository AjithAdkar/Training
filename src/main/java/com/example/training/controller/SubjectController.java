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
//import com.example.training.module.Subject;
//import com.example.training.service.SubjectService;
//@RestController
//public class SubjectController {
//	
//	@Autowired
//	SubjectService subjectService;
//	
//	 @GetMapping("/subject/{id}")
//	  public Subject getSubject(@PathVariable("id") Long id) {
//		 return subjectService.getSubjectById(id);
//	 }
//	 
//	 @GetMapping("/subject")
//		private List<Subject> getAllSubject() {
//			return subjectService.getAllSubject();
//		}
//	 @DeleteMapping("/subject/{id}")
//        public void delete(@PathVariable ("id") Long id) {
//		 subjectService.delete(id);
//	 }
//	 
//	 @PostMapping("/subject")
//		private Subject addSubject(@RequestBody Subject subject) {
//			return this.subjectService.addSubject(subject);
//		}
//		
//	 @PutMapping("/subject/{id}")
//		private Subject updateSubject(@RequestBody Subject subject) {
//			return subjectService.updateSubject(subject);
//		}
//
//}
