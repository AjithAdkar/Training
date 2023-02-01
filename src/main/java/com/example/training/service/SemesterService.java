package com.example.training.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.training.module.Semester;
import com.example.training.repository.SemesterRepository;

@Service
public class SemesterService {
	@Autowired
	SemesterRepository semesterRepository;

	public Semester getSemesterById(Long id) {
		return semesterRepository.findById(id).get();
	}

	public List<Semester> getAllSemester() {
		List<Semester> semester = new ArrayList<Semester>();
		semesterRepository.findAll().forEach(semester::add);
		return semester;
	}

	public void delete(Long id) {
		semesterRepository.deleteById(id);
	}

	public Semester addSemester(Semester semester) {
		return semesterRepository.save(semester);
	}

	public Semester updateSemester(Semester semester) {
		return semesterRepository.save(semester);
	}

}
