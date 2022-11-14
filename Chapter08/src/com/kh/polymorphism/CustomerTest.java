package com.kh.polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerKim = new VIPCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		
		System.out.println();
		
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		
		int price = 10000;
		int leeprice = customerLee.calcPrice(price);
		int kimprice = customerKim.calcPrice(price);
		
		System.out.println(customerLee.getCustomerName() +
				"님이 " + leeprice + "원 지불하셨습니다.");
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println(customerKim.getCustomerName() +
				"님이 " + kimprice + "원 지불하셨습니다.");
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
