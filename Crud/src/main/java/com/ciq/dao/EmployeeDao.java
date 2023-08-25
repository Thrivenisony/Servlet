package com.ciq.dao;

import java.util.List;

import com.ciq.model.Employee;

public interface EmployeeDao {
	void save(Employee employee);
	List<Employee>getAll();
	void update(Employee employee);
	void delete(int id);
}
