package com.ciq.queries;

public interface StudentQueries {
	final static String student_save="INSERT INTO STUDENT VALUES(?,?,?,?,?)";
    final static String student_getAll="SELECT *FROM STUDENT";
    final static String student_UPDATE_QUERY = "UPDATE STUDENT SET NAME=?, COURSE=?, EMAIL=?, ADDRESS=? WHERE ID=?";
    final static String student_delete="DELETE FROM STUDENT WHERE ID=?";
    final static String student_getById="SELECT *FROM STUDENT WHERE ID=?";
}
