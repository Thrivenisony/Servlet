package com.ciq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ciq.connection.ConnectionUtill;
import com.ciq.model.Student;

import com.ciq.queries.StudentQueries;

public class StudentDaoImp implements StudentDao {
	private static Connection connection=null;
	 private static PreparedStatement ps=null;
	private static ResultSet rs=null;
	@Override
	public void save(Student student) {
		
		try {
			 connection=ConnectionUtill.getConncetion();
			ps=connection.prepareStatement(StudentQueries.student_save);
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setString(3, student.getCourse());
			ps.setString(4, student.getEmail());
			ps.setString(5, student.getAddress());
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
	public List<Student> getAll() {
		try {
			connection=ConnectionUtill.getConncetion();
			ps=connection.prepareStatement(StudentQueries.student_getAll);
			rs=ps.executeQuery();
			List<Student> student=new ArrayList<>();
			while(rs.next()) {
				Student stu=new Student();
				stu.setId(rs.getInt(1));
				stu.setName(rs.getString(2));
				stu.setCourse(rs.getString(3));
				stu.setEmail(rs.getString(4));
				stu.setAddress(rs.getString(5));
                student.add(stu);				
			}
			return student;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			ConnectionUtill.close(rs, ps, connection);
		}
		
		return null;
	}

	@Override
	public void update(Student student) {
		try {
			 connection=ConnectionUtill.getConncetion();
			ps=connection.prepareStatement(StudentQueries.student_UPDATE_QUERY);
			ps.setInt(5, student.getId());
			ps.setString(1, student.getName());
			ps.setString(2, student.getCourse());
			ps.setString(3, student.getEmail());
			ps.setString(4, student.getAddress());
			int result= ps.executeUpdate();
			System.out.println(result+"updated!!!!");
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
			ps=connection.prepareStatement(StudentQueries.student_delete);
			ps.setInt(1, id);
			int result=ps.executeUpdate();
			System.out.println(result+"delete successfully");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ConnectionUtill.close(ps, connection);
		}
		
	}


	@Override
	public Student findById(int id) {
		try {
			Student student=new Student();
			connection=ConnectionUtill.getConncetion();
			ps=connection.prepareStatement(StudentQueries.student_getById);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setCourse(rs.getString(3));
				student.setEmail(rs.getString(4));
				student.setAddress(rs.getString(5));
			}
			return student;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				return null;
	}
	public static void main(String[] args) {
		StudentDaoImp sdi=new StudentDaoImp();
		Student stu=new Student(5, "sahithi", "btech", "sahithi@gmail.com", "hyd");
	     sdi.save(stu);
//		Student student=sdi.findById(1);
//		System.out.println(student);
	
		
	//}
	}
}
