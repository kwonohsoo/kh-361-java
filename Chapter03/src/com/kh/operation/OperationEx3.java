package com.kh.operation;

public class OperationEx3 {

	public static void main(String[] args) {

		System.out.println("복합 대입 연산자");
		
		int number = 12;
		number += 3;	//	number = number + 3;
		String str = "Hello";
		
		System.out.println("number += 는(은) " + number + " 이다.");
		
		number -=5;		//	number = number - 5;
		System.out.println("number -= 는(은) " + number + " 이다.");
		
		str += "\t World\n!!";		//	str = str + "\t World\n!!";
									// \t = Tap을 나타내는 문자
									// \n = Enter를 나타내는 문자
		System.out.println(str);

		str += 123;		// str = str + 123;
		
		System.out.println(str);
		
		System.out.println("=========================================");
		
		System.out.println("조건 연산자");
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
		int num = 29;
		String result = "";
		
		// num의 값이 짝수인지 홀수인지 판별 후 출력
		// 예시)
		// 짝수입니다. or 홀수입니다.

		result = ((num % 2) == 0) ? "짝수입니다." : "홀수입니다.";
		
		System.out.println(result);
		
		
	}

}
