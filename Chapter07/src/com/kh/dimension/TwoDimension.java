package com.kh.dimension;

public class TwoDimension {

	public static void main(String[] args) {
		
		int[][] arr = {{1, 2, 3}, {4, 5, 6}};
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);

		//	가변 배열
		double[][] dArr = new double[2][];
		
		dArr[0] = new double[4];
		dArr[1] = new double[] {1.1, 3.3};
		
		for(int i = 0; i < dArr.length; i++) {
			for (int j = 0; j< dArr[i].length; j++) {
				System.out.print(dArr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		char[][] alphabets = new char[2][13];
		char ch = 'a';
		
		for (int i = 0; i < alphabets.length; i++) {
			for (int j = 0; j < alphabets[i].length; j++) {
				alphabets[i][j] = ch;
				System.out.print(alphabets[i][j] + " ");
				ch++;
			}
			System.out.println();
		}
		
	}

}
