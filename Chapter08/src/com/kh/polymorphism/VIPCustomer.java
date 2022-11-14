package com.kh.polymorphism;

public class VIPCustomer extends Customer {

	private int agentID;	//	VIP 고객 담당 상담원 아이디
	
	double saleRatio;		//	할인율
	
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		super.customerGrade = "VIP";
		this.bonusRatio = 0.05;		//	보너스 적립 5%
		this.saleRatio = 0.1;		//	할인율 10%
	}

	public String showVIPInfo() {
		return super.showCustomerInfo() + " 담당 상담원의 아이디는 " + agentID + "입니다.";
	}
	
	
	public int getAgentID() {		//	VIP 고객에게만 필요한 메서드
		return agentID;
	}

	@Override
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		
		return price - (int) (price * this.saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원의 아이디는 " + this.agentID + "입니다.";
	}
	
	
	
}
