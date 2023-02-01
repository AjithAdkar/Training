package com.example.training.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.training.module.Subject;
import com.example.training.repository.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	SubjectRepository subjectRepository;

	public Subject getSubjectById(Long id) {
		return subjectRepository.findById(id).get();
	}

	public List<Subject> getAllSubject() {
		List<Subject> subject = new ArrayList<Subject>();
		subjectRepository.findAll().forEach(subject::add);
		return subject;
	}

	public void delete(Long id) {
		subjectRepository.deleteById(id);
	}

	public Subject addSubject(Subject subject) {
		return subjectRepository.save(subject);
	}

	public Subject updateSubject(Subject subject) {
		return subjectRepository.save(subject);
	}
}
