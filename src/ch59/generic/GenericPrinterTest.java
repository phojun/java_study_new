package ch59.generic;

import ch59.generic.nongeneric.Powder;

public class GenericPrinterTest {
	
	public static void main(String[] args) {
		
		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();//다이아몬든 연산자 내부에서 자료형은 생략가능 함
		powderPrinter.setMaterial(powder);
		
		Powder p = powderPrinter.getMaterial();//제네릭 타입으로 프로그래밍 하면 형변환을 하지 않아도 됨
		
		System.out.println(powderPrinter.toString());
		System.out.println(p.toString());

	}

}
