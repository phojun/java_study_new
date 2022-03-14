package ch73;


/*여행사에 패키지 여행 상품이 있습니다. 여행 비용은 15세 이상은 100만원, 그 미만은 50만원 입니다. 
고객 세 명이 패키지 여행을 떠난다고 했을 때 비용 계산과 고객 명단 검색등에 대한 연산을 스트림을 활용하여 구현해 봅니다.
고객에 대한 클래스를 만들고 ArrayList로 고객을 관리 합니다. 

고객 정보는 다음과 같습니다.

CustomerLee 
이름 : 이순신
나이 : 40
비용 : 100

CustomerKim
이름 : 김유신
나이 : 20 
비용 : 100

CustomerHong
이름 : 홍길동
나이 :13
비용 : 50*/
public class TravelCustomer {
	
	private String name;
	private int age;
	private int price;
	
	public TravelCustomer(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "TravelCustomer [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	


}
