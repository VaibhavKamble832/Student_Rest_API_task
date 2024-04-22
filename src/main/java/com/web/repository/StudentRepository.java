package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.dto.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	
}
