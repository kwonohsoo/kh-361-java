package com.kh.cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student James = new Student("James", 5000);		// 학생 두명 생성
		Student Tomas = new Student("Tomas", 10000);	//
		Student Edward = new Student("Edward", 30000);
		
		James.showInfo();
		Tomas.showInfo();
		Edward.showInfo();

		System.out.println();
		
		Bus bus100 = new Bus(100);		//	노선 번호가 100번인 버스 생성
		
		bus100.showInfo();
		James.takeBus(bus100);			//	james가 100번 버스를 탐
		James.showInfo();
		bus100.showInfo();
		
		System.out.println();
		
		Subway subwayGreen = new Subway("2호선");
		
		subwayGreen.showInfo();
		Tomas.takeSubway(subwayGreen);
		Tomas.showInfo();
		subwayGreen.showInfo();
		
		System.out.println();
		
		Taxi taxi = new Taxi("JAVA");
		Edward.takeTaxi(taxi);
		Edward.showInfo();
		taxi.showInfo();
		
		
	}

}
