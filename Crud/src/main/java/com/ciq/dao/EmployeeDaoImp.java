package com.ciq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ciq.connection.ConnectionUtill;
import com.ciq.model.Employee;
import com.ciq.queries.EmpQueries;

public class EmployeeDaoImp implements EmployeeDao {
	private static Connection connection=null;
	 private static PreparedStatement ps=null;
	private static ResultSet rs=null;
	@Override
	public void save (Employee employee) {
		 try {
			 connection=ConnectionUtill.getConncetion();
			ps=connection.prepareStatement(EmpQueries.Emp_save);
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setDouble(3, employee.getSalary());
			ps.setString(4, employee.getAddress());
			int result= ps.executeUpdate();
			System.out.println(result+"inserted!!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ConnectionUtill.close(ps, connection);
		}
	}
	@Override
	public List<Employee> getAll() {
		
		try {
			connection=ConnectionUtill.getConncetion();
			ps=connection.prepareStatement(EmpQueries.Emp_getAll);
			rs=ps.executeQuery();
			List<Employee> Employee=new ArrayList<>();
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				emp.setAddress(rs.getString(4));
				Employee.add(emp);
			}
			return Employee;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ConnectionUtill.close(rs, ps, connection);
		}
		
		return null;
	}
	@Override
	public void update(Employee employee) {
		
		try {
			connection=ConnectionUtill.getConncetion();
			ps=connection.prepareStatement(EmpQueries.EMP_UPDATE_QUERY);
			ps.setInt(4, employee.getId());
			ps.setString(1, employee.getName());
			ps.setDouble(2, employee.getSalary());
			ps.setString(3, employee.getAddress());
			int result=ps.executeUpdate();
			System.out.println(result+"update");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			ConnectionUtill.close(ps, connection);

		}
		
		}
	@Override
	public void delete(int id) {
		
		try {
			connection=ConnectionUtill.getConncetion();
			ps=connection.prepareStatement(EmpQueries.Emp_delete);
			ps.setInt(1, id);
			 int result = ps.executeUpdate();
			System.out.println(result+"delete successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ConnectionUtill.close(ps, connection);
		}
		
	}	
	


		
	}

	




