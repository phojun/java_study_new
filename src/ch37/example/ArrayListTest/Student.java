package ch37.example.ArrayListTest;

import java.util.ArrayList;

/*1001학번 Lee와 1002학번 Kim, 두 학생이 있습니다. 
Lee 학생은 국어와 수학 2과목을 수강했고, Kim 학생은 국어, 수학, 영어 3 과목을 수강하였습니다.
Lee 학생은 국어 100점, 수학 50점입니다. 
Kim 학생은 국어 70점, 수학 85점, 영어 100점입니다. 
Student와 Subject 클래스를 만들고 ArrayList를 활용하여 두 학생의 과목 성적과 총점을 출력하세요*/

public class Student {
	
	private static int personalNum=1000;
	private int studentID;
	private String name;
	private ArrayList<Subject> subjectList;
	private ArrayList<String> studentSubject = new ArrayList<String>();
	
	
	public Student() {
		super();
	}
	
	public Student(String name) {
		super();
		this.studentID = (++personalNum);
		this.name = name;
		this.subjectList = new ArrayList<Subject>();
	}

	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addSubject(String subjectName, int score) {
		Subject subject = new Subject(subjectName, score);
		subjectList.add(subject);
	}

	public void showInfo() {
		
		int total = 0;
		for(Subject s : subjectList) {
			total+=s.getScore();
		}
		for(Subject s : subjectList) {
			studentSubject.add(s.getSubjectName());
		}
		System.out.println("학생번호 : "+studentID+", 학생 수강과목 : " + studentSubject.toString() + ", 총점 = " + total);
	}

}
