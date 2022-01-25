package ch49;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2==0) {
			return ERROR;
		}else {
			return num1/num2;
		}
	
	}
	/*
	 * @Override public void description() {
	 * System.out.println("CompleteCalc의 description메서드 입니다 오버라이딩 되었습니다"); }
	 */

	public void showInfo() {
		System.out.println("모두 구현 했습니다.");
	}

}
