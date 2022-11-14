package com.kh.inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint = 10000;
		
		Customer customerHong = new VIPCustomer(10030, "홍길동", 2000);
		
		int price = 10000;
		
		System.out.println(customerLee.getCustomerName() +
				" 님이 지불해야 하는 금액은 " + customerLee.calcPrice(price) + "원 입니다.");
		
		System.out.println(customerKim.getCustomerName() +
				" 님이 지불해야 하는 금액은 " + customerKim.calcPrice(price) + "원 입니다.");
		
		System.out.println(customerHong.getCustomerName() +
				" 님이 지불해야 하는 금액은 " + customerHong.calcPrice(price) + "원 입니다.");
		
	}

}
