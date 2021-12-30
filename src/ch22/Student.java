package ch22;

public class Student {
	private int studentID;
	private String studentName;
	private String address;
	
	public Student() {//기본 생성자
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Student(int studentID, String studentName, String address) {//생성자
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.address = address;
	}
	
//getter & setter private 참조변수의 경우 호출하지 못하기 때문에 get,set 메서드를 통해 변수 변경,호출 가능
	public int getStudentID() {
		return studentID;
	}


	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getStudentName() {
		return studentName;
	}


	public void showStudentInfo() {//매서드
		System.out.println(studentID+"학번의 이름은 "+studentName+"이고, 주소는 "+address+"입니다.");
	}
	
	
	
	public void setStudentName(String studentName) {//매서드
		this.studentName=studentName;
	}


	@Override
	public String toString() {//toString 매서드
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", address=" + address + "]";
	}
	
	
}
