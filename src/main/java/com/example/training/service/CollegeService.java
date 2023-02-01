package com.example.training.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.training.module.College;
import com.example.training.repository.CollegeRepository;
import com.example.training.request.CollegeRequest;

@Service
public class CollegeService {
	
	
	public List<College> college = new ArrayList<College>();
	public List<CollegeRequest> collegerequest = new ArrayList<CollegeRequest>();
	

	@Autowired
	CollegeRepository collegeRepositery;

	public College getCollageById(Long id) {
		return collegeRepositery.findById(id).get();
	}

	public List<College> getAllCollege() {
		List<College> college = new ArrayList<College>();
		collegeRepositery.findAll().forEach(college::add);
		return college;
	}

	public College addCollege(College college) {
		return collegeRepositery.save(college);
	}

	public void delete(Long id) {
		collegeRepositery.deleteById(id);
	}

	public College updateCollege(College college) {
		return collegeRepositery.save(college);
	}
	

//	public void updateBook(College college,Long id)
//	{
//		list.stream().map(b->{
//			return b;
//		})
//	}


	public String edit(CollegeRequest clg) {
		collegerequest.stream().filter(e -> e.getId() == clg.getId()).forEach(e->{
			clg.setName(clg.getName());
			clg.setAddress(clg.getAddress());
			clg.setPhonenumber(clg.getPhonenumber());
			clg.setDoornumber(clg.getDoornumber());
			clg.setState(clg.getState());
			clg.setPincode(clg.getPincode());
			clg.setEmailid(clg.getEmailid());
			clg.setStreet(clg.getStreet());
			clg.setDistrict(clg.getDistrict());
			clg.setCountry(clg.getCountry());

		});
		return "updated successfully";
	}
}
