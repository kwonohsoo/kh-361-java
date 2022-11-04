package com.kh.variable;

public class Conversion {

	public static void main(String[] args) {

		// 묵시적 형 변환
		
		byte bNum = 10;
		int iNum = bNum;
		float fNum = iNum;
		double dNum = fNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		System.out.println(fNum);
		System.out.println(dNum);
		
		// 명시적 형 변환
		
		dNum = 1.2;
		fNum = (float)dNum;
		
		
		System.out.println(dNum);
		System.out.println(fNum);
		
		// 데이터 손실 테스트
		iNum = 290;
		bNum = (byte) iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		System.out.println((int) fNum);	
		
		// 연산 시 형 변환 테스트
		double result = 12 + 3.3;	// 12.0 + 3.3 = 15.3
		long result2 = 30 + 30;		// 30 + 30 = 60, 60을 long으로 형 변환하여 저장(60L)
		long result3 = 30 + 30L;	// 30L + 30L = 60L
		int result4 = (int)10.0 + (int)5.5;	// 10 + 5 = 15
		int result5 = (int)(10.0 + 5.5);	// 10 + 5 = 15	15.5를 int로 형 변환하여 저장
		
		// 문자열에서의 + 연산자는 문자열을 서로 연결하는 연산자이다.
		// "Hello" + "World" = "HelloWorld"
		// 피연산자 중에 한 쪽이 문자열이면 다른 피연산자를 문자열로 변환하고 서로 연결한다.
		// "123" + 123 => "123" + "123" => "123123"
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		
		// 연습문제 Q4
		int x = 10;
		double y = 2.0;
		
		System.out.println((int)(x + y));	// (x + (int)y)
		System.out.println((int)(x - y));
		System.out.println((int)(x * y));
		System.out.println((int)(x / y));
		
		
		// 연습문제 Q5
		char ch = '\uAE00';
				
		System.out.println(ch);

		
	}

}
