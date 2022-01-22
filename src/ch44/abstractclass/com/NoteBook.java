package ch44.abstractclass.com;

//Computer 클래스의 추상메서드중 하나라도 구현을 하지 않으면 abstract 클래스로 정의해야함
public abstract class NoteBook extends Computer{

	@Override
	public void display() {
		System.out.println("MyNoteBook display");
		
	}

}
