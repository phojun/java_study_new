package ch59.generic.nongeneric;

public class ThreeDPrinterTest {
	
	public static void main(String[] args) {
		
		Powder powder = new Powder();
		ThreeDPrinter2 printer = new ThreeDPrinter2();
		
		printer.setMaterial(powder);
		
		Powder p = (Powder)printer.getMaterial();//형변환을 해줘야되는 단점이 있음
		
		System.out.println(p.toString());
	}

}
