package ch31.com.singletonPattern;

//import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		Company com1 = Company.getInstance();//호출 방식
		Company com2 = Company.getInstance();
		
		System.out.println(com1);
		System.out.println(com2);// 주소가 같음을 알 수 있다 오직 하나만 생성할 수 있음 
		//why? static을 활용했기 때문
		
		//자바유틸에서 제공하는 싱글톤 패턴
		//Calendar calendar=Calendar.getInstance();
		
	}

}
