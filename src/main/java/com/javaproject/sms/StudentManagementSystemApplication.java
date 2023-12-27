package com.javaproject.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaproject.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception{
		/*
		 * Student student1 = new Student("Ramesh","Fadatare", "ramesh@gmail.com");
		 * repo.save(student1); Student student2 = new Student("kukku","gurjar",
		 * "kukku@gmail.com"); repo.save(student2); Student student3 = new
		 * Student("kittu","singh", "kittu@icloud.com"); repo.save(student3); Student
		 * student4 = new Student("chassu","gujjar", "chassu@gmail.com");
		 * repo.save(student4);
		 */
	}

}
