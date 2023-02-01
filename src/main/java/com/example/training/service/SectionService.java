//package com.example.training.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.training.module.Section;
//import com.example.training.repository.SectionRepository;
//
//@Service
//public class SectionService {
//	@Autowired
//	SectionRepository sectionRepository;
//	
//	 public Section getSectionById(Long id) {
//		 return sectionRepository.findById(id).get();
//	 }
//
//	 public List<Section> getAllCourse() {
//			List<Section> section=new ArrayList<Section>();
//			sectionRepository.findAll().forEach(section::add);
//			return section;
//	 }
//	 
//	 public void delete(Long id) {
//		 sectionRepository.deleteById(id);	 
//	 }
//	 
//	 public Section addCourse(Section section) {
//		 return sectionRepository.save(section);
//	 }
//	 
//	 public Section updateCourse(Section section) {
//		 return sectionRepository.save(section);
//	 }
//}
