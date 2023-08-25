package com.ciq.service;

import java.util.List;

import com.ciq.dao.EmployeeDaoImp;
import com.ciq.model.Employee;

public class EmpServiceImp implements EmpService{
  EmployeeDaoImp edi=new EmployeeDaoImp();
	@Override
	public void save(Employee employee) {
		edi.save(employee);
		
	}
	@Override
	public List<Employee> getAll() {
		
		return edi.getAll();
	}
	@Override
	public void update(Employee employee) {
		edi.update(employee);
		
	}
	@Override
	public void delete(int id) {
		edi.delete(id);
		
	}

}
