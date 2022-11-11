package com.kh._static;

public class Student {
	private static int serialNum = 1000;
	
	private int studentId;
	private String studentName;
	private int grade;
	private String address;
	
	
	public Student() {
		studentId = ++serialNum;
	}

	
	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void studentInfo() {
		System.out.println(studentName + " 학번 : " + studentId);
	}
	
	
	
}
