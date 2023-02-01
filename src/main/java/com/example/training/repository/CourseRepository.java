package com.example.training.repository;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.training.module.Course;
@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

@Query("SELECT course FROM Course course WHERE course.id=id")
Optional<Course> findById(@Param("id") Long id); 

}
