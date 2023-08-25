package com.ciq.service;

import java.util.List;

import com.ciq.dao.StudentDaoImp;
import com.ciq.model.Student;

public class StudentServiceImp  implements StudentService{
  StudentDaoImp service=new StudentDaoImp();
	@Override
	public void save(Student student) {
		service.save(student);
		
	}

	@Override
	public List<Student> getAll() {
		
		return service.getAll();
	}

	@Override
	public void update(Student student) {
		service.update(student);
		
	}

	@Override
	public void delete(int id) {
	service.delete(id);
		
	}

	@Override
	public Student findById(int id) {
		
		return service.findById(id);
	}
	

}
