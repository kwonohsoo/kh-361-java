package com.kh.arraysort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraySort {
		/*	
		 * 배열 정렬
		 * 	- 데이터를 순차적으로 나열하는 과정을 정렬이라 한다. (성적순, 이름순, 나이순, 최신순, 인기순 ...)
		 * 	- 오름차순(Ascending, ASC)은 작은 데이터부터 큰 데이터로 나열하는 방식이다.
		 * 	- 내림차순(Descending, DESC)은 큰 데이터부터 작은 데이터로 나열하는 방식이다.
		 * 	- 종류
		 * 		- 선택 정렬
		 * 		- 버블 정렬
		 * 		- 삽입 정렬
		 * 		- 퀵 정렬
		 * 		- 병합 정렬
		 * 		- 쉘 정렬
		 *		- 기타 등등 
		 */
		
	public static void main(String[] args) {
		
		int[] arr = {2, 5, 7, 1, 3};
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
		//	오름차순으로 정렬
		Arrays.sort(arr);
		System.out.println();
		
		for (int num : arr) {
			System.out.print(num + " ");
		}

		System.out.println();
		
		//	내림차순으로 정렬
		//	1. for 문을 사용해서 오름차순으로 정렬된 배열의 값을 반대로 새로운 배열에 대입한다.
		//	2. Wrapper 클래스를 사용하는 방법
		Integer[] integerArray = {2, 5, 7, 1, 3};
		Arrays.sort(integerArray, Collections.reverseOrder());
		System.out.println(Arrays.toString(integerArray));
		
		
		System.out.println();
		System.out.println();
		
		
		String[] strArr = {"apple", "orange", "banana", "메론", "레몬"};
		
		System.out.println(Arrays.toString(strArr));
		
		//	오름차순으로 정렬
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		//	내림차순으로 정렬
		Arrays.sort(strArr, Collections.reverseOrder());
		System.out.println(Arrays.toString(strArr));
		
		
		
		
		
	}

}
