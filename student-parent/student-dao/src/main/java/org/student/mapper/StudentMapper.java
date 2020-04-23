package org.student.mapper;

import org.student.pojo.Student;

public interface StudentMapper {
	public void addStudent(Student student);
	Student queryStudentBySnum(int snum);
}
