package com.javaproject.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.sms.entity.Student;
public interface StudentRepository extends JpaRepository<Student,Long> {

	
}
