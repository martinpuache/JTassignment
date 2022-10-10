package com.training.web;

import javax.persistence.*;


@Entity
@Table(name="Student_test")
public class Student {
	
	@Id
	@Column(name="stud_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	@Column(name="stud_name")
	private String studName;
	@Column(name="stud_grade")
	private String grade;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Student(int studId, String studName, String grade) {
		super();
		this.studentId = studId;
		this.studName = studName;
		this.grade = grade;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}