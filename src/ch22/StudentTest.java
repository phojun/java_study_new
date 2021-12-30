package ch22;

public class StudentTest {
	public static void main(String[] args) {
		Student studentPark = new Student(2013508053, "박호준","서울시 영등포구");//생성자 호출
		
		studentPark.showStudentInfo();//생성된 객체의 메서드 사용
		
		System.out.println(studentPark.getStudentName());//생성된 객체의 메서드 사용
		
		studentPark.setStudentName("ParkHoJun");//생성된 객체의 메서드 사용
		System.out.println(studentPark.getStudentName());//생성된 객체의 메서드 사용
		
		//System.out.println(studentPark.studentName); 변수를 private으로 해서 바로 호출 불가능 get,set매서드로 변환 가능
		}
}
// 생성자 호출로 불려진 studentPark객체는 인스턴스라고 함
//인스턴스는 동적메모리 즉,HeapMemory에 할당됨
//Heap과 Stack 메모리의 차이는 객체와 변수에 있으며, stack은 사용후 반환되어 사라지는 반면, heap은 사라지지 않음,
//직접 프로그래머가 해제 시켜야 함, 하지만 자바는 garbageCollector가 주기적으로 사용하지 않는 메모리를 수거함

/*
 * 용어정리!!
 * 
 * 객체 : 객체 지향 프로그램의 대상, 생성된 인스턴스
 * 
 * 클래스 : 객체를 프로그래밍 하기위해 코드로 정의해 놓은 상태
 * 
 * 인스턴스 : new 키워드를 사용하여 클래스를 메모리에 생성한 상태
 * 
 * 멤버 변수 : 클래스의 속성, 특성
 * 
 * 메서드 : 멤버 변수를 이용하여 클래스의 기능을 구현한 함수
 * 
 * 참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수
 * 
 * 참조 값 : 생성된 인스턴스의 메모리 주소 값
 */