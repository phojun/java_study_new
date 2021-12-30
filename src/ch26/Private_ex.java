package ch26;

public class Private_ex {//private 접근제어지시자(access modifier)는 getter setter메서드로 참조변수를 변환,저장 할 수 있다.
	private int day;
	private int month;
	private int year;
	private boolean isValid;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day=day;  
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month<1||month>12) {//유효성 검사!!
			isValid=false;
		}else {
			isValid=true;
			this.month = month;
		}
		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void showDate() {
		if(isValid) {
			System.out.println(year+"년 "+month+"월 "+ day+"입니다.");
		}else {
			System.out.println("유효하지 않은 정보입니다");
		}
	}
	
}
