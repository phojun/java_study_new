package ch44.abstractclass.com;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer(); 추상클래스는 인스턴스를 생성할 수 없다(오류)
		Computer d1 = new DeskTop();
		d1.display();
		d1.typing();
		d1.turnOn();
		d1.turnOff();
		
		MyNoteBook n1 = new MyNoteBook();
		n1.display();
		n1.typing();
		n1.turnOn();
		n1.turnOff();

	}

}
