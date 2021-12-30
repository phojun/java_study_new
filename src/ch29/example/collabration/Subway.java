package ch29.example.collabration;

/*James와 Tomas는 각각 버스와 지하철을 타고 학교에 갑니다.
James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불합니다.
Tomas는 10000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불합니다.

두 학생이 버스와 지하철을 타는 상황을 구현해 봅시다.*/
public class Subway {
	
	private int passenger;
	private String color;
	private int money;
	
	public Subway(String color) {
		this.color=color;
	}
	
	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void take(int money) {
		this.money+=money;	
		passenger++;
		System.out.println("총 탑승 고객 : "+passenger+", 총 수익 : "+money);
	}
	
	public void showInfo() {
		System.out.println(color+"색 지하철은 승객을 "+passenger+"명 태웠고, "+money+"원을 벌었습니다.");
	}

}
