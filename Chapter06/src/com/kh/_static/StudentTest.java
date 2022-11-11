package com.kh._static;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		
		studentLee.setStudentName("이지원");
		System.out.println(Student.getSerialNum());
		studentLee.studentInfo();
		
		Student studentSon = new Student();
		
		studentSon.setStudentName("손수경");
		System.out.println(Student.getSerialNum());
		studentSon.studentInfo();
		
		
	}
	
}