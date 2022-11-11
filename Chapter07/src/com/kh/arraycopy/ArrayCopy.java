package com.kh.arraycopy;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {

		//	System 클래스에서 제공하는 arraycopy() 메소드를 이용한 복사
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = new int [10];
		
		System.arraycopy(array1, 0, array2, 5, array1.length);
		
		for (int num : array1) {
			System.out.print(num + " ");
		}
		
		
		System.out.println();
		
		
		for (int num : array2) {
			System.out.print(num + " ");
		}
		
		
		System.out.println();
		
		
		//	Arrary 클래스에서 제공하는 copyOf() 메소드를 이용한 복사
		int[] array3 = Arrays.copyOf(array1, 10);
		
		for (int num : array3) {
			System.out.print(num + " ");
		}
		
		
		System.out.println();
		
		
		//	clone() 메소드를 이용한 복사
		int[] array4 = array1.clone();
		
		for (int num : array4) {
			System.out.print(num + " ");
		}
		
		
		System.out.println();
		
		
		//	for 문을 이용한 복사
		int[] array5 = new int[5];
		
		for(int i = 0; i < array1.length; i++) {
		}
		
		for (int num : array5) {
			System.out.print(num + " ");
		}
		
		
		System.out.println();
		
		
		System.out.println(array1);
		System.out.println(array2);
		System.out.println(array3);
		System.out.println(array4);
		System.out.println(array5);
	}

}
