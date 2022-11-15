package com.kh.polymorphism;

import com.kh.polymorphism.animal.Animal;
import com.kh.polymorphism.animal.Eagle;
import com.kh.polymorphism.animal.Human;
import com.kh.polymorphism.animal.Tiger;

public class AnimalTest {

	public static void main(String[] args) {
//		Animal human = new Human();
//		Animal tiger = new Tiger();
//		Animal eagle = new Eagle();
		
//		AnimalTest.moveAnimal(human);
//		moveAnimal(tiger);
//		moveAnimal(eagle);
		
		AnimalTest.moveAnimal(new Human());
		moveAnimal(new Tiger());
		moveAnimal(new Eagle());
	}
	
	public static void moveAnimal(Animal animal) {	//	매개변수의 자료형이 상위 클래스
		animal.move();		//	재정의된 메서드가 호출됨
	}

}
