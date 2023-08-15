package com.myapp.studentdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.myapp.studentdetails.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	@Query(value="select * from test_db.student_details where rool_number=?",nativeQuery=true)
	public Student getNamebyRoolNo(int roolNumber);
	

}
