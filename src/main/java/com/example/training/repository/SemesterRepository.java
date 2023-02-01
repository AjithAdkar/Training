package com.example.training.repository;

import java.util.Optional;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.example.training.module.Semester;

public interface SemesterRepository extends CrudRepository<Semester, Long> {

	@Query("SELECT semester FROM Semester semester WHERE semester.id=id")
	Optional<Semester> findById(@Param("id") Long id);

}
