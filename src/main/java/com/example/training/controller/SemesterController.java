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
//import com.example.training.module.Semester;
//import com.example.training.service.SemesterService;
//@RestController
//public class SemesterController {
//	
//    @Autowired
//	SemesterService semesterService;
//
//
//	@GetMapping("/semester/{id}")
//	  public Semester getSemester(@PathVariable("id") Long id) {
//		 return semesterService.getSemesterById(id);
//	 }
//	 
//	 @GetMapping("/semester")
//		private List<Semester> getAllSemester() {
//			return semesterService.getAllSemester();
//		}
//	 @DeleteMapping("/semester/{id}")
//      public void semester(@PathVariable ("id") Long id) {
//		 semesterService.delete(id);
//	 }
//	 
//	 @PostMapping("/semester")
//		private Semester addSemester(@RequestBody Semester semester) {
//			return this.semesterService.addSemester(semester);
//		}
//		
//	 @PutMapping("/semester")
//		private Semester updateSemester(@RequestBody Semester semester) {
//			return semesterService.updateSemester(semester);
//		}
//}
