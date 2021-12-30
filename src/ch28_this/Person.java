package ch28_this;

public class Person {
	
	String name;
	int age;
	//생성자가 여러 개 인경우, this를 이용하여 생성자에서 다른 생성자를 호출할 수 있음
	public Person() {
		//this() statement 이전에 다른 statement를 쓸 수 없음
		this("이름없음",1);//생성자에서 또 다른 생성자를 호출 할때 사용
	}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public void showPerson() {
		System.out.println(name+" : "+age);
	}
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("홍길동",14);
		
		p1.showPerson();
		p2.showPerson();
		
		Person p3 = p2.getPerson();
		//p1!=p2==p3
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
