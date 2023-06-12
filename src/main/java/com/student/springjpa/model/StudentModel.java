package com.student.springjpa.model;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.student.springjpa.entity.Student;

public class StudentModel{
	 
    private Long studentId;
    
	@NotNull(message = "Student name is required")
    private String studentName;
     
	@NotNull(message = "Father name is required")
    private String fatherName;
     
	@NotNull(message = "Mother name is required")
    private String motherName;
	
	@NotNull(message = "Gender is required")
    private String gender;
	
	@NotNull(message = "DOB is required")
    private String dob;
	
	@NotNull(message = "Email is required")
	@Email(message = "Email should be valid format")
    private String email;
	
	@NotNull(message = "University is required")
    private String university;
	
	@NotNull(message = "Level is required")
    private String level;
	
	@NotNull(message = "Major is required")
    private String major;
	
	@NotNull(message = "Phone is required")
    private String phone;
	
	private List<Student> studentList;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
}
