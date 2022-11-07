package com.kh.operation;

public class OperationEx2 {

	public static void main(String[] args) {

		//관계 연산자
		System.out.println("관계 연산자");
		
		int myAge = 29;
		boolean value = (myAge >25);
		System.out.println(value);
		
		value = ('A' == 65);	// 65(char) == 65(int)  int
		System.out.println(value);
		
		value = (3 == 3.0);	// 3.0(int) == 3.0(double) double
		System.out.println(value);
		
		//	단, 예외가 있다.
		//	부동소수점 타입은 오차가 생길 수 있기 때문에 대부분의 비교 연산에서는 정수 타입을 사용한다.
		value = (0.1 == 0.1f);
		System.out.println(value);
		
		//myAge 값이 짝수인지, 홀수인지 판단해보자
		value = (myAge % 2) == 0;
		System.out.println("myAge는 짝수인가? " + value);
		
		value = (myAge % 2) != 0;
		System.out.println("myAge는 홀수인가? " + value);
		
		//논리 연산자
		System.out.println("=========================================");
		System.out.println("논리 연산자");
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0) || (num2 > 0);
		System.out.println(flag);
		
		//	num1의 값이 1 부터 100 사이의 값인지 확인
		//	1 <= num1 <=100
		flag = (1 <= num1) && (num1 <= 100);
		System.out.println(flag);
		
		//단락 회로 평가
		System.out.println("=========================================");
		System.out.println("*단락 회로 평가 실습*");

		int i = 2;
		num1 = 10;
		
		value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
