package com.kh.variable;

public class Variable {

	public static void main(String[] args) {
		int level;		// 정수형 변수 level 선언
//		int level;	똑같은 이름의 변수 사용 안됨
		level = 10;		// level 변수에 10을 대입
		System.out.println(level);
		
		int LEVEL;		// 변수는 대소문자 구분
		LEVEL = 100;
		System.out.println(LEVEL);
		
		int age = 20;	// 정수형 변수 age에 선언과 동시에 값을 대입(초기화)한다.
		System.out.println(age);
		
//		int public = 30; 
//		int void
//		int int		 예약어를 변수명으로 사용 불가
		
//		숫자로 시작하면 안 된다.
//		1age; <-x //	 int age1; <-O 
		
//		특수 문자는 '_', '$'만 사용이 가능하다.
		int _age;
		int $age;
//		int #age;
//		int @age;
		
	}

}

