package ch41.polymorphism.com;

import java.util.ArrayList;

/*
 * 다형성
 * 
- 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
- 같은 코드에서 여러 다른 실행 결과가 나옴
- 정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나임
- 다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들수 있음

 */
class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	public void eating() {
		System.out.println("식사를 합니다.");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void read() {
		System.out.println("사람이 책을 읽습니다.");
	}

}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}

}

class Eagle extends Animal{
	
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아 다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
	}
}

public class AnimalTest{
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		/*
		 * AnimalTest test = new AnimalTest();
		 * 
		 * test.moveAnimal(hAnimal); test.moveAnimal(tAnimal); test.moveAnimal(eAnimal);
		 */
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
	}
	

}
	

