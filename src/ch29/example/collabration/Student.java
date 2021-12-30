package ch29.example.collabration;

/*James와 Tomas는 각각 버스와 지하철을 타고 학교에 갑니다.
James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불합니다.
Tomas는 10000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불합니다.

두 학생이 버스와 지하철을 타는 상황을 구현해 봅시다.*/

public class Student {
	private String name;
	private int money;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Student(String name, int money) {
		this.name= name;
		this.money=money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money-=1000;
		System.out.println(bus.getBusNo()+"번 버스를 탑니다 1000원이 지출됩니다.");
	}
	
	public void takeSubway(Subway sub) {
		sub.take(1200);
		this.money-=1200;
		System.out.println(sub.getColor()+"색 지하철을 탑니다. 1200원이 지출됩니다.");
	}
	
	public void showInfo() {
		System.out.println(name+"님의 남은 돈은 "+money+"원 입니다.");
	}
}
