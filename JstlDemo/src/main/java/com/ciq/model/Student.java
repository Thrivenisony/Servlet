package com.ciq.model;

public class Student {
	private int id;
	private String name;
	private String course;
	private String email;
	private String address;
	
	public Student() {
		
	}

	public Student(int id, String name, String course, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.email = email;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", email=" + email + ", address="
				+ address + "]";
	}
	
	

}
