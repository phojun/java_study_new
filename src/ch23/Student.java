package ch23;

public class Student {//생성자 연습
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {//기본생성자(생성 안해도 JVM에서 알아서 생성해줌 하지만 이게 있다는 것은 꼭 알아야됨 !)
		super();
	}//이 생성자가 있어야 인스턴스 생성이 가능! but, 안써도 자동 생성됨!!!
	
	public Student(int studentNumber, String studentName, int grade) {//오버로딩 생성자!!
		super();
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}//오버라이딩과 다름 주의!!

	public String showStudentInfo() {//메서드
		return studentNumber+"학생의 학번은 "+studentName+"이고, "+grade+"학년 입니다.";
	}

}
