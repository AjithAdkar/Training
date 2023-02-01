package com.example.training.repository;

import java.util.Optional;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.training.module.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
	@Query("SELECT department FROM Department department WHERE department.id=id")
	Optional<Department> findById(@Param("id") Long id);

}
