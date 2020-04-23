package org.student.service;

import org.student.pojo.Student;

public interface StudentService {
	void addStudent(Student student);
	Student queryStudent(int snum);
}
