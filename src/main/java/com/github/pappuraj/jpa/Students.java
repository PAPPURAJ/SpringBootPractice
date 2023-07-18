package com.github.pappuraj.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Students {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int id;
	private String name;
	private int studentID;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students( String name, int studentID) {
		super();
		this.name = name;
		this.studentID = studentID;
	}
	public Students(int id, String name, int studentID) {
		super();
		this.id = id;
		this.name = name;
		this.studentID = studentID;
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
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", studentID=" + studentID + "]";
	}
	
	
	
	
	

}
