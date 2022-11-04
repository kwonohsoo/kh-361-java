package com.kh.operation;

public class OperationEX1 {

	public static void main(String[] args) {

		int num = 10;
		
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);

		num = -num;
		System.out.println(num);
		
		// 산술 연산자
		int mathScore = 85;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println("총점 : " + totalScore);
		
		double avgScore = totalScore / 2.0;
		System.out.println("평균 : " + avgScore);
		
		// 나머지 언산]
		System.out.println(11 % 2);
		System.out.println(35.0 % 10.0);
		
		//증가 감소 연산자
		int gameScore = 150;
		
		int lastScore = ++gameScore;

		System.out.println(lastScore);
		
		int lastScore2 = --gameScore;
				
		System.out.println(lastScore2);
		System.out.println(gameScore);
		
		int value = 10;
		int num2 = value++;
		
		System.out.println(num2);
		System.out.println(value);

		// 실습 문제
		int number = 20;
		int result = number++ * 3;
		
		System.out.println(number);		// 21
		System.out.println(result);		// 20 * 3 = 60
		
		int number1 = 10;
		int number2 = 20;
		int number3 = 30;
		
		System.out.println(number1++);		// 10(11)
		System.out.println((++number1) + (number2++));		// 12 + 20(21) = 32
		System.out.println((number1++) + (--number2) + (--number3));	// 12(13) + 20 + 29 = 61
		
		System.out.println(number1);	// 13
		System.out.println(number2);	// 20
		System.out.println(number3);	// 29

		
	}

}
