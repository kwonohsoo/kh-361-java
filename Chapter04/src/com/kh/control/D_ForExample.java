package com.kh.control;

public class D_ForExample {

	public static void main(String[] args) {

		System.out.println("for 문");
		//	for(초기화식; 조건식; 증감식) {
		//		수행문;
		//	}
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		
		// 구구단 출력(8단 출력)
		for(int i = 1; i <= 9; i++) {
			System.out.println("8 X " + i + " = " + (8 * i));
		}
		
		System.out.println("=======================================");
		System.out.println("중첩된 반복문");
		
		for(int dan = 2; dan <=9; dan++) {
			System.out.println("=== " + dan + " 단 ===");
			for(int items = 1; items <= 9; items++) {
				System.out.println(dan + " X " + items + " = " + (dan * items));
			}
			System.out.println();
		}
		
	}

}
