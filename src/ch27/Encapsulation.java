package ch27;

//보고서 만들기

public class Encapsulation {//대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만 제공
	//메서드나 멤버 변수를 접근함으로써 발생하는 오류를 최소화 할 수 있는 장점이 있다.

	StringBuffer buffer = new StringBuffer();

	private String line = "===========================================\n";
	private String title = "  이름\t\t   주소 \t\t  전화번호  \n";

//보고서 구성 메서드로 구성된 인스턴스라 보면 됨 비공개
	private void makeHeader() {// 머릿말
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}

	private void generateBody() {// 본문
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");

		buffer.append("Tomas \t");
		buffer.append("NewYork US \t");
		buffer.append("010-7777-0987\n");
	}

	private void makeFooter() {//꼬리말

		buffer.append(line);
	}
	
	public String getReport() {//보고서 호출 메서드
		makeHeader();
		generateBody();
		makeFooter();
		
		return buffer.toString();
	}
}
