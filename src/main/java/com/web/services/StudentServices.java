package com.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dto.Student;
import com.web.repository.StudentRepository;

@Service
public class StudentServices {
	
	@Autowired
    private StudentRepository studentRepo;

	public Student saveNewStudent(Student student) {
		return studentRepo.save(student);
	}

	public List<Student> findAllStudents() {
        return studentRepo.findAll();
    }

	public Student findStudentById(int id) {
		return studentRepo.findById(id).get();
	}


    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }
}
	

