package com.kh._this;

public class Person {
	
	private String name;
	private int age;
	
	public Person(){
//		this.name = "이름없음";
//		this.age = 1;
//		System.out.println("기본 생성자 호출");	//	this 위에 오면 오류 발생
		this ("이름없음", 1);              
		

	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
