package com.kh.polymorphism;

public class GoldCustomer extends Customer {

	double saleRatio;

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override		//	재정의한 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		
		return price - (int)(price * saleRatio);
	}
	
}