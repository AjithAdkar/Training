package com.example.training.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.training.module.Instructor;
import com.example.training.repository.InstructorRepository;

@Service
public class InstructorService {
	@Autowired
	InstructorRepository instructorRepository;

	public Instructor getInstructorById(Long id) {
		return instructorRepository.findById(id).get();
	}

	public List<Instructor> getAllInstructor() {
		List<Instructor> instructor = new ArrayList<Instructor>();
		instructorRepository.findAll().forEach(instructor::add);
		return instructor;
	}

	public void delete(Long id) {
		instructorRepository.deleteById(id);
	}

	public Instructor addInstructor(Instructor instructor) {
		return instructorRepository.save(instructor);
	}

	public Instructor updateInstructor(Instructor instructor) {
		return instructorRepository.save(instructor);
	}

}
