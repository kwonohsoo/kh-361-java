package com.kh.control;

public class F_Break {

	public static void main(String[] args) {

		/*
		 * 1부터 랜덤 값(1 ~10)까지의 합계를 반복문을 통해서 출력한다.
		 * 단, 랜덤 값이 숫자 5가 나오면 프로그램을 종료한다.
		 */
		
		int sum = 0;
		int random = 0;
		
		while(true) {
			if(random == 5) {
				break;
			}	
			sum = 0;
			random = (int)(Math.random() * 10 + 1);
			

			
			for(int i = 1; i <= random; i++) {
				sum += i; //sum = sum + i;
				
			}
			
			System.out.println("1부터 " + random + "까지의 합계 : " + sum);
			
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
