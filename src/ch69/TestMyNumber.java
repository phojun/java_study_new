package ch69;

public class TestMyNumber {
	
	public static void main(String[] args) {
		
		MyNumber myNumber = (x,y)-> x>y ? x:y;
		
		System.out.println(myNumber.getMax(7, 9));
	}

}
