package com.javaproject.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javaproject.sms.entity.Student;
import com.javaproject.sms.repository.StudentRepository;
import com.javaproject.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository repo;
	
	
	public StudentServiceImpl(StudentRepository repo) {
		super();
		this.repo = repo;
	}


	public List<Student> getAllStudents(){
		return repo.findAll();
	}
	
	public Student saveStudent(Student student) {
		return repo.save(student);
	}
	
	public Student getStudentById(Long id) {
		return repo.findById(id).get();
	}
	
	public Student updateStudent(Student student) {
		return repo.save(student);
	}
	
	public void deleteStudentById(Long id) {
		repo.deleteById(id);
	}


}
