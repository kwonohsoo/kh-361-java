package com.kh.control;

public class IfExample {

	public static void main(String[] args) {

		System.out.println("if-else 문");
		
		int age = 7;
		if (age >= 8) {
			System.out.println(age + "세는 학교에 다닙니다.");
		}
		else {
			System.out.println(age + "세는 학교에 다니지 않습니다.");
		}

		
		char gender = 'F';
		if (gender == 'F') {
			System.out.println("여성입니다.");
		}
		else {
			System.out.println("남성입니다.");
		}
		
		System.out.println("==============================");
		System.out.println("if-else if-else 문");
	
		int charge;
		age = 61;
		
		if (age < 8) {
			charge = 1000;
			
			System.out.println("취학 전 아동입니다.");
		}
		else if (age < 14) {
			charge = 2000;
			
			System.out.println("초등학생입니다.");
		}
		else if (age < 20) {
			charge = 2500;
			
			System.out.println("중, 고등학생입니다.");
		}
		else if (age >= 60) {
			charge = 0;
			
			System.out.println("경로우대입니다.");
		}
		else {
			charge = 3000;
			
			System.out.println("일반인입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원입니다.");
	}

}
