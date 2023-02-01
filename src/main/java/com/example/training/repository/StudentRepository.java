package com.example.training.repository;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.example.training.module.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	@Query("SELECT student FROM Student student WHERE student.id=id")
	Optional<Student> findById(@Param("id") Long id);
}
