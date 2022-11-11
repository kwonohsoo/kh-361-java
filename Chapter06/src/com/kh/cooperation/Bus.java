package com.kh.cooperation;

public class Bus {
	private int busNmumber;		//	버스 번호
	
	private int passengerCount;	//	승객 수
	
	private int money;			//	버스 수입

	
	public Bus(int busNmumber) {				//	버스 번호를 매개변수로 받는 생성자
		this.busNmumber = busNmumber;			//	
	}
	
	public void take(int money) {				//	승객이 버스에 탄 경우를 구현한 메서드
		this.money += money;	//	버스 수입 증가	//
		passengerCount++;		//	승객 수 증가	//
		
	}
	
	public void showInfo() {
		System.out.println("버스 " + this.busNmumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}											//	버스 정보를 출력하는 메서드

}
