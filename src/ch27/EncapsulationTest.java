package ch27;

public class EncapsulationTest {

	public static void main(String[] args) {
		Encapsulation report = new Encapsulation();
		String builder = report.getReport();
		
		System.out.println(builder);

	}

}
