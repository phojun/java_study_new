package ch29.example.collabration;
/*James와 Tomas는 각각 버스와 지하철을 타고 학교에 갑니다.
James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불합니다.
Tomas는 10000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불합니다.

두 학생이 버스와 지하철을 타는 상황을 구현해 봅시다.*/
public class CollabrationTest {
	
	public static void main(String[] args) {
		Student s1 = new Student("James", 5000);
		Student s2 = new Student("Tomas",10000);

		Bus bus1 = new Bus(100);
		Subway sub1 = new Subway("green");
		
		s1.takeBus(bus1);
		s1.takeSubway(sub1);
		s2.takeSubway(sub1);
		
		s1.showInfo();
		s2.showInfo();
		bus1.showInfo();
		sub1.showInfo();
	}
}
