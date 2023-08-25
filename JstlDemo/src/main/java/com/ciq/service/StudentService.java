package com.ciq.service;

import java.util.List;

import com.ciq.model.Student;

public interface StudentService {
	void save(Student student);
	List<Student>getAll();
	void update(Student student);
	void delete(int id);
	Student findById(int id);

}
