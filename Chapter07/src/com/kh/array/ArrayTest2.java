package com.kh.array;

public class ArrayTest2 {

	public static void main(String[] args) {

//		int[] studentIDs = new int[5];
//		int[] studentIDs = new int[] {100, 200, 300, 400, 500};
//		int[] studentIDs = {100, 200, 300, 400, 500};
		int[] studentIDs;
		studentIDs = new int[] {100, 200, 300, 400, 500};
		
//		studentIDs[0] = 100;
//		studentIDs[1] = 200;
//		studentIDs[2] = 300;
//		studentIDs[3] = 400;
//		studentIDs[4] = 500;
	
		System.out.println(studentIDs[0]);
		System.out.println(studentIDs[1]);
		System.out.println(studentIDs[2]);
		System.out.println(studentIDs[3]);
		System.out.println(studentIDs[4]);
		
		System.out.println();
		
		for (int i = 0; i < studentIDs.length; i++) {
			System.out.println(studentIDs[i]);
		}
		
		System.out.println();
		
		int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}

}
