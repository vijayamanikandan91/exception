package com.myapp.studentdetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myapp.studentdetails.entity.Student;
import com.myapp.studentdetails.repository.StudentRepository;

@Repository
public class StudentDao {
	
	@Autowired
	StudentRepository studentRepo;
	public String addAllStudent(List<Student> students) {
		studentRepo.saveAll(students);
		return "added successfully";
		
	}
	
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}
	
	public String addStudent(Student s) {
		studentRepo.save(s);
		return "added successfully";
	}
	
	public String updateStudent(Student s) {
		studentRepo.save(s);
		return "Updated Successfully";
		
	}
	
	public String deleteStudentById(int id) {
		studentRepo.deleteById(id);
		return "deleted successfully";
	}
	
	public Student getNamebyRoolNo(int roolNumber) {
		return studentRepo.getNamebyRoolNo(roolNumber);
	}

}
