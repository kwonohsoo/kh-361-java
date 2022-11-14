package com.kh.inheritance;

public class VIPCustomer extends Customer {

	private int agentID;	//	VIP 고객 담당 상담원 아이디
	
	double saleRatio;		//	할인율
	
	public VIPCustomer() {
//		super();		//	호출되는 생성자는 상위 클래스의 기본 생성자 임 
//		setCustomerGrade("VIP");	//	고객 등급
//		this.customerGrade = "VIP";
		super.customerGrade = "VIP";
		this.bonusRatio = 0.05;		//	보너스 적립 5%
		this.saleRatio = 0.1;		//	할인율 10%
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		super.customerGrade = "VIP";
		this.bonusRatio = 0.05;		//	보너스 적립 5%
		this.saleRatio = 0.1;		//	할인율 10%
		System.out.println("VIPCustomer(int, String, int) 생성자 호출");
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
}
