package com.kh.polymorphism;

import java.util.ArrayList;

import com.kh.polymorphism.animal.Animal;
import com.kh.polymorphism.animal.Eagle;
import com.kh.polymorphism.animal.Human;
import com.kh.polymorphism.animal.Tiger;

public class AnimalTest2 {
	ArrayList<Animal> aniList = new ArrayList<>();
	
	public static void main(String[] args) {
		AnimalTest2 aTest = new AnimalTest2();
		
		aTest.addAnimal();
		
		System.out.println("원래 형으로 다운 캐스팅");
		
		aTest.testCasting();
	}
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for (Animal animal : aniList) {
			animal.move();
		}
	}
	
	public void testCasting() {
		for (int i = 0; i < aniList.size(); i++) {
			Animal animal = aniList.get(i);
			
			if (animal instanceof Human) {
				Human h = (Human)animal;
				h.readBook();
				
			} else if (animal instanceof Tiger) {
				Tiger t = (Tiger)animal;
				t.hunting();
				
			} else if (animal instanceof Eagle) {
				Eagle e = (Eagle)animal;
				e.flying();
				
			} else {
				animal.move();
			}
		}
	}
}