package com.ciq.service;

import java.util.List;

import com.ciq.model.Employee;

public interface EmpService {
	void save(Employee employee);
	List<Employee>getAll();
	void update(Employee employee);
	void delete (int id);
}
