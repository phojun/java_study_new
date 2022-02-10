package ch60;

public class GenericMethod {
	/*
	 * - 자료형 매개변수를 메서드의 매개변수나 반환 값으로 가지는 메서드는
	 *  - 자료형 매개 변수가 하나 이상인 경우도 있음
	 *  - 제네릭 클래스가 아니어도 내부에 제네릭 메서드는 구현하여 사용 할 수 있음
	 *  - public <자료형 매개 변수> 반환형 메서드 이름(자료형 매개변수.....) { }
	 * 
	 */
	public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V>p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right =((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		
		Point<Integer, Double> p1 = new Point<Integer, Double>(0,0.0);
		Point<Integer, Double> p2 = new Point<Integer, Double>(10,10.0);
		
		double size = GenericMethod.makeRectangle(p1, p2);
		
		System.out.println(size);
	}

}
