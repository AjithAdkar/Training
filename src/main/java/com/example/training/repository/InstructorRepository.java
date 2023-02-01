package com.example.training.repository;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.training.module.Instructor;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor, Long> {
	@Query("SELECT instructor FROM Instructor instructor WHERE instructor.id=id")
	Optional<Instructor> findById(@Param("id") Long id);

}
