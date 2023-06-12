package com.student.springjpa.service;

import java.util.List;
import java.util.Optional;

import com.student.springjpa.entity.Student;
import com.student.springjpa.model.StudentModel;

public interface StudentService {

	public List<Student> getAllStudents();
	
	public StudentModel getStudentById(Long studentId);
	
	public StudentModel saveStudent(StudentModel studentModel);
	
	public StudentModel updateStudent(StudentModel studentModel);
	
	public void deleteStudent(Long studentId);
}
