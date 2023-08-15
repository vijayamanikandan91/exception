package com.myapp.studentdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.studentdetails.dao.StudentDao;
import com.myapp.studentdetails.entity.AgeException;
import com.myapp.studentdetails.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;

	public String addAllStudent(List<Student> students) {
		return studentDao.addAllStudent(students);
	}

	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();

	}

	public String addStudent(Student s) throws AgeException {
		try {
			if(s.getAge()<18) {
				throw new AgeException("Invalid Age");
			} else {
		
		return studentDao.addStudent(s);
	}
		}
		catch(AgeException ae) {
			return ae.getMessage();
		}
	}
	
	public String updateStudent(Student s) {
		return studentDao.updateStudent(s);
	}
	
	public String deleteStudentById(int id) {
		return studentDao.deleteStudentById(id);
	}
	
	public Student getNamebyRoolNo(int roolNumber) {
		return studentDao.getNamebyRoolNo(roolNumber);
	}
	
}
	


	
