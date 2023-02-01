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
//import com.example.training.module.Section;
//import com.example.training.service.SectionService;
//
//@RestController
//public class SectionController {
//	
//	 
//	@Autowired
//	SectionService sectionService;
//	
//	 @GetMapping("/section/{id}")
//	  public Section getInstructor(@PathVariable("id") Long id) {
//		 return sectionService.getSectionById(id);
//	 }
//	 
//	 @GetMapping("/section")
//		private List<Section> getAllCourse() {
//			return sectionService.getAllCourse();
//		}
//	 @DeleteMapping("/section/{id}")
//        public void instructor(@PathVariable ("id") Long id) {
//		 sectionService.delete(id);
//	 }
//	 
//	 @PostMapping("/section")
//		private Section addCourse(@RequestBody Section section) {
//			return this.sectionService.addCourse(section);
//		}
//		
//	 @PutMapping("/section")
//		private Section updateCourse(@RequestBody Section section) {
//			return sectionService.updateCourse(section);
//		}
//}
