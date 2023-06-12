package com.student.springjpa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.springjpa.model.StudentModel;
import com.student.springjpa.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@InitBinder
	private void InitBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}
	
	@ModelAttribute
    public void initModel(StudentModel studentModel, Model model) {
        model.addAttribute("model", studentModel);
    }
	
	@GetMapping("allstudents")
	public String getBuildingList(StudentModel studentModel, Model model) {
		studentModel = new StudentModel();
		studentModel.setStudentList(studentService.getAllStudents());
		model.addAttribute("model", studentModel);
		return "students";
	}
		
	@PostMapping("registerstudent")
	public String registerStudent(@Valid @ModelAttribute("model") StudentModel studentModel, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			studentModel.setStudentList(studentService.getAllStudents());
			return "students";
		}
		
		studentService.saveStudent(studentModel);
		return "redirect:/allstudents";
	}
	
	@GetMapping("updatestudent/{id}")
	public String getExistStudent(@PathVariable("id") Long studentId,Model model) {
		
		StudentModel existingStudent = studentService.getStudentById(studentId);
		model.addAttribute("model",existingStudent);
		return "updatestudent";
	}
	
	@PostMapping("updatestudent")
	public String updateStudent(@Valid @ModelAttribute("model") StudentModel studentModel, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			return "updatestudent";
		}
		
		studentService.updateStudent(studentModel);
		return "redirect:/allstudents";
	}
	
	@GetMapping("deletestudent/{id}")
	public String deleteStudent(@PathVariable("id") Long studentId,Model model) {
		
		studentService.deleteStudent(studentId);
		return "redirect:/allstudents";
	}
	
}
