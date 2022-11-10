package com.kh.array;

public class ArrayTest {

	public static void main(String[] args) {

		//	배열을 사용하지 않을 때 (불편한 점)
		//	다량의 데이터를 기록하고자 할 때
//		int score1 = 90;
//		int score2 = 80;
//		int score3 = 70;
//		int score4 = 60;
//		int score5 = 50;
		
		int[] score = {90, 80, 70, 60, 50};
		
		//	다량의 데이터를 출력하고자 할 때
//		System.out.println(score1);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
//		System.out.println(score5);
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		//	합계...
//		int sum = score1 + score2 + score3 + score4 + score5;
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		System.out.println(sum);
		
	}

}
