package com.kh.control;

public class C_WhileExample {

	public static void main(String[] args) {

		System.out.println("while 문");
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;		// sum = sum + num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		// 1부터 랜덤값 (1 ~ 10)까지의 합계
		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드를 사용해서 랜덤값을 발생시킬 수 있다.
		 * Math.random() 실행 시 --> 0.0 ~ 0.9999... 사이의 랜덤값을 발생시킨다.
		 */
		//	int random = Math.random(); // Math.random() 실행 시 랜덤값이 double 타입이라 대입이 안된다.
		
		//	doble random = Math.random() * 10; // 0.0 ~ 9.9999...
		//	doble random = Math.random() * 10 + 1; // 1.0 ~ 10.9999...
		int random = (int) (Math.random() * 10 + 1);
		num = 1;
		sum = 0;
		
		System.out.println("random : " + random);
		
		while(num <= random) {
			sum += num;
			num++;
		}
		
		System.out.println("1부터 " + random + "까지의 합 : " + sum);
		
		System.out.println("========================================");
		System.out.println("do while 문");
		
		num = 1;
		
		while(num == 0) {
			System.out.println("while 문 수행");
		}
		
		do {
			System.out.println("do-while 문 수행");
		} while (num == 0);
		
		// 구구단 출력 (3단 출력)
		int dan = 3;
		num = 1;	//(1 ~ 9)
		
		do {
			System.out.println(dan + " X " + num + " = " + (dan * num));
			
			num++;
		} while(num <= 9);
		

	}

}
