package ch25;

public class StudentSubjectTest {

	public static void main(String[] args) {
		Student studentPark = new Student("Park", 11111111);
		studentPark.setKorea("국어를 알아야 한국인이다", 80, 1);
		studentPark.setMath("수학의 정석", 90, 8);
		
		studentPark.showStudentScore();

	}

}
