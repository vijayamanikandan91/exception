package com.myapp.studentdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.studentdetails.entity.AgeException;
import com.myapp.studentdetails.entity.Student;
import com.myapp.studentdetails.service.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	StudentService studentSer;

	@PostMapping(value = "/addallstudent")
	public String addAllStudent(@RequestBody List<Student> students) {
		return studentSer.addAllStudent(students);
	}
	
	@GetMapping(value = "/getallstudent")
	public List<Student> getAllStudents(){
		return studentSer.getAllStudents();
	}
	
	@PostMapping(value="/addstudent")
	public String addStudent(@RequestBody Student s) throws AgeException {		
		return studentSer.addStudent(s);
	}
	
	@PutMapping(value="/updating")
	public String updateStudent(@RequestBody Student s) {
		return studentSer.updateStudent(s);
	}
	
	@DeleteMapping(value="/deletebyid/{id}")
	public String deleteStudentById(@PathVariable int id) {
		return studentSer.deleteStudentById(id);
	}
	
	@GetMapping(value="/getnamebyrlno/{roolNumber}")
	public Student getNamebyRoolNo(@PathVariable int roolNumber) {
		return studentSer.getNamebyRoolNo(roolNumber);
	}

}
