package com.kh.control;

public class B_SwitchExample {

	public static void main(String[] args) {

		System.out.println("Switch-case 문");
		
		int rank = 1;
		char medalColor;
		
		switch (rank) {
			case 1 : 
				medalColor = 'G';
				
				break;
			case 2 : 
				medalColor = 'S';
				
				break;
			case 3 : 
				medalColor = 'B';
				
				break;
			default:
				medalColor = 'A';
		}
		
		System.out.println(rank + "등 메달의 색깔은 " + medalColor + " 입니다.");
		
		System.out.println("==============================");
		System.out.println("case문 동시에 사용하기");
		
		/*
		 * 31일까지 존재하는 월 : 1, 3, 5, 7, 8, 10, 12
		 * 30일까지 존재하는 월 : 4, 6, 9, 11
		 * 28일까지 존재하는 월 : 2
		 */
		
		int month = 3;
		
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month + "월은 31일까지 입니다.");
				
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month + "월은 30일까지 입니다.");
				
				break;
			case 2:
				System.out.println(month + "월은 28일까지 입니다.");
		}
		
		System.out.println("=======================");
		System.out.println("case문에 문자열 사용하기");
		
		String medal = "Gold";
		
		switch(medal) {
			case "Gold":
				
				System.out.println("금메달 입니다.");
				break;
			case "Silver":
				
				System.out.println("은메달 입니다.");
				break;
			case "Bronze":
				
				System.out.println("동메달 입니다.");
				break;
			default :
				
				System.out.println("메달이 없습니다.");
				
		}
		
	}

}
