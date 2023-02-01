package com.example.training.controller;


import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.training.module.College;
import com.example.training.repository.CollegeRepository;
import com.example.training.request.CollegeRequest;
import com.example.training.request.getCollegeRequest;
import com.example.training.response.Response;
import com.example.training.service.CollegeService;



@RestController
@CrossOrigin
public class CollegeController {
    
	@Autowired
	CollegeRepository collegeRepository;
	@Autowired
	CollegeService collegeService;

	@PostMapping("/getcollege")
	@CrossOrigin
	public Optional<College> getCollege(HttpServletRequest zHttpRequest,
			@Valid @RequestBody getCollegeRequest zRequest) {
		return collegeRepository.findById(zRequest.getId());
	}

	// TO FETCH ALL THE RECORD FROM THE TABLE DATA BY PROVIDING ONLY TABLE_NAME IN
	// THE URL
	@GetMapping("/college")
	@CrossOrigin
	private List<College> getAllCollege() {
		return collegeService.getAllCollege();
	}

	// delete the record from the table
	@DeleteMapping("/college/{id}")
	@CrossOrigin
	private String deletecollege(@PathVariable("id") Long id) {
		collegeService.delete(id);
		return "college deleted";
	}

	// adding new record in to the table
	@PostMapping("/college")
	@CrossOrigin
	private ResponseEntity<Object> addCollege(HttpServletRequest zHttpRequest,
			@Valid @RequestBody CollegeRequest zRequest) {
		Optional<College> email = collegeRepository.findByEmailid(zRequest.getEmailid());
		Optional<College> phonenumber = collegeRepository.findByPhonenumber(zRequest.getPhonenumber());
		if (email.isPresent() && phonenumber.isPresent()) {
			return Response.generateResponse("EMAIL AND PHONE ALREADY EXIST", HttpStatus.ALREADY_REPORTED, null);
		}

		else if (email.isPresent()) {
			return Response.generateResponse("EMAIL ALREADY EXIST", HttpStatus.ALREADY_REPORTED, null);
		} else if (phonenumber.isPresent()) {
			return Response.generateResponse("PHONE NUMBER ALREADY EXIST", HttpStatus.ALREADY_REPORTED, null);
		} else {
			College college = new College();
			college.setName(zRequest.getName());
			college.setAddress(zRequest.getAddress());

			college.setPhonenumber(zRequest.getPhonenumber());
			college.setDoornumber(zRequest.getDoornumber());
			college.setState(zRequest.getState());
			college.setPincode(zRequest.getPincode());
			college.setEmailid(zRequest.getEmailid());
			college.setStreet(zRequest.getStreet());
			college.setDistrict(zRequest.getDistrict());
			college.setCountry(zRequest.getCountry());

			collegeRepository.save(college);
			return Response.generateResponse("data saved successfully", HttpStatus.OK, college);
		}
	}

	// updating table content
	@PutMapping("/edit/{id}")
	@CrossOrigin
	public ResponseEntity<College> getCollegeById(@PathVariable Long id,@RequestBody CollegeRequest collegerequest){
		
		College clg=collegeRepository.findById(id).get();
		
		clg.setName(collegerequest.getName());
		clg.setAddress(collegerequest.getAddress());
		clg.setPhonenumber(collegerequest.getPhonenumber());
		clg.setDoornumber(collegerequest.getDoornumber());
		clg.setState(collegerequest.getState());
		clg.setPincode(collegerequest.getPincode());
		clg.setEmailid(collegerequest.getEmailid());
		clg.setStreet(collegerequest.getStreet());
		clg.setDistrict(collegerequest.getDistrict());
		clg.setCountry(collegerequest.getCountry());
		
		College updateclg=collegeRepository.save(clg);
		return ResponseEntity.ok().body(updateclg);
	}
//	@GetMapping("/college/{id}")
//	public Optional<College> getCollege(@PathVariable("id")Long id,getCollegeRequest gcr) {
//		return collegeRepository.findById(gcr.getId());
//	}
	@PutMapping("/update")
	@CrossOrigin
	public College updateCollege(College college)
	{
		return collegeRepository.save(college);
	}
	

}