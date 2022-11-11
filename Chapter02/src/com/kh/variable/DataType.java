package com.kh.variable;

public class DataType {

	public static void main(String[] args) {
		
		// *정수형*

		// byte 형 (-128 ~ 127)
		byte bs1 = -128;
		// byte bs2 = 128;  범위 초과 오류
		
		// short 형 (-32768 ~ 32767)
		short s = 32767;
		
		// int 형 (-2,147,483,648 ~ 2,147,483,647)
		int inum = 10;
		// short result = bs1 + s 오류
		// 내부적으로 int형으로 변환해야한다.
		int result = bs1 + s;

		// long 형 (-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)
		long lnum = 1234567891234L;

		
		System.out.println(bs1);
		System.out.println(s);
		System.out.println(inum);
		System.out.println(result);
		System.out.println(lnum);
		
		
		// *문자형*

		char ch1 = '한';
		//char ch1 = '\uBBA4';	// u = 유니코드  BBA4 = 뮤
		//char ch1 = '\u0000';
		char ch2 = 66;
		//char ch2 = -32768; 음수값은 안된다.
		char ch3 =  '\uAD8C';
		
		String str = "ABCD";	// 여러개의 문자데이터는 String 형을 사용한다.
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(str);
		
		
		//*실수형*
		
		double dnum = 3.14;
		float fnum = 3.14F;

		System.out.println(dnum);
		System.out.println(fnum);
		
		
		//*논리형*
		
		boolean isMarried = true;	// 참, 거짓의 값을 나타내는 값
		
		System.out.println(isMarried);
		
	}

}
