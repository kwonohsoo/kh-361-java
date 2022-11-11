package com.kh.cooperation;

public class Taxi {
	String comepanyName;
	int money;
	public Taxi(String comepanyName) {
		this.comepanyName = comepanyName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(comepanyName + " 택시 수입은 " + money + "원 입니다.");
	}

}
