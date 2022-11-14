package com.kh.polymorphism;

class Animal{
	public void move( ) {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		moveAnimal(new Human());
		moveAnimal(new Tiger());
		moveAnimal(new Eagle());
	}
	
	public static void moveAnimal(Animal animal) {	//	매개변수의 자료형이 상위 클래스
		animal.move();		//	재정의된 메서드가 호출됨
	}

}
