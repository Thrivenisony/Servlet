package com.ciq.queries;

public interface EmpQueries {
	final static String Emp_save="INSERT INTO EMPLOYEE VALUES(?,?,?,?)";
    final static String Emp_getAll="SELECT *FROM EMPLOYEE";
    final static String EMP_UPDATE_QUERY = "UPDATE EMPLOYEE SET NAME=?, SALARY=?, ADDRESS=? WHERE ID=?";
    final static String Emp_delete="DELETE FROM EMPLOYEE WHERE ID=?";
}
