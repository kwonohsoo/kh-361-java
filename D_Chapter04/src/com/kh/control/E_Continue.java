package com.kh.control;

public class E_Continue {

	public static void main(String[] args) {

		System.out.println("continue 문");
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
//			if(num % 2 != 0) {
//				total += num; // total = total + num;
//			}
			if(num % 2 == 0) {
				continue;
			}
			total += num;
		}
		
		System.out.println("합계 : "  + total);
		
		// 2 ~ 9단 까지의 구구단을 출력
		// 단, 홀수단은 빼고 출력한다.
		
		for(int dan = 2; dan <=9; dan++) {
			
			if((dan % 2) != 0) {
				continue;
			}
			System.out.println("=== " + dan + " 단 ===");
				
			for(int items = 1; items <= 9; items++) {
				
				System.out.println(dan + " X " + items + " = " + (dan * items));
			}
			System.out.println();
		}
		
	}

}
