package com.example.training.repository;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.example.training.module.Subject;

public interface SubjectRepository extends CrudRepository<Subject, Long> {
	@Query("SELECT subject FROM Subject subject WHERE subject.id=id")
	Optional<Subject> findById(@Param("id") Long id);

}
