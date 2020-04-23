package org.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.student.mapper.StudentMapper;
import org.student.pojo.Student;
import org.student.service.StudentService;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	@Qualifier("studentMapper")
	private StudentMapper studentMapper;


	public void addStudent(Student student) {
		studentMapper.addStudent(student);
		
	}

	public Student queryStudent(int snum) {
		
		return studentMapper.queryStudentBySnum(snum);
	}
	
}
