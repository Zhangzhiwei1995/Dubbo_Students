package org.student.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.student.pojo.Student;
import org.student.service.StudentService;

import com.alibaba.dubbo.config.annotation.Reference;

@Controller
@RequestMapping("controller")
public class StudentController {
	@Reference //AutoWire
	private  StudentService studentService ;
	
	@RequestMapping("queryStudentByNo")
	public ModelAndView queryStudentByNo() {
		ModelAndView mv = new ModelAndView("success");
		
		Student student = studentService.queryStudent(1);
		mv.addObject("student",student) ;//request域
		
		System.out.println(student);
		
		return mv;
	}
	
	@RequestMapping("addStudent")
	public String addStudent() {
		Student student = new Student(2,"zs6",68);
		studentService.addStudent(student);
		return "success" ;
	}
	
	
}