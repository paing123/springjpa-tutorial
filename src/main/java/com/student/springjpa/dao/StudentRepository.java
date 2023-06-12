package com.student.springjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.springjpa.entity.Student;
import com.student.springjpa.model.StudentModel;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
