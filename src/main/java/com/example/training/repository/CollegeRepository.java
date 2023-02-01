package com.example.training.repository;

import java.util.Optional;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.training.module.College;

@Repository
public interface CollegeRepository extends CrudRepository<College, Long> {

//	@Query("SELECT college FROM College college WHERE college.id=id")
	//Optional<College> findById(@Param("id") Long id);

	@Query("SELECT college FROM College college WHERE college.emailid =emailid")
	Optional<College> findByEmailid(@Param("emailid") String email_id);

	@Query("SELECT college FROM College college WHERE college.phonenumber = phonenumber")
	Optional<College> findByPhonenumber(@Param("phonenumber") String phonenumber);

	@Query("SELECT college.name FROM College college WHERE college.id=id")
	Optional<College> findById(@Param("id") Long id);

}
