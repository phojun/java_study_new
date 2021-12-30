package ch23;

public class StudentTest {//테스트 코드
	public static void main(String[] args) {
		Student studentPark = new Student();// 인스턴스 즉, 객체 생성 heap메모리에 할당됨
		
		//기본생성자로 생성되어 모든 참조변수가 0 or null로 생성됨(자동 초기화 라고 함)
		System.out.println(studentPark.showStudentInfo());
		
		//참조변수 설정
		studentPark.studentName="박호준";
		studentPark.studentNumber=2013508053;
		studentPark.grade=4;
		//출력
		System.out.println(studentPark.showStudentInfo());
		
		//기본 생정자가 아닌 오버로딩 생성자로 인스턴스 생성
		Student studentKim = new Student(111111,"Kim",3);
		
		System.out.println(studentKim.showStudentInfo());
		
		
	}
}
