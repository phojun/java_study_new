package ch25;

public class Student {
	private String studentName;
	private int studentID;
	Subject korea;
	Subject math;
	
	

	public Student(String studentName, int studentID) {
		super();
		this.studentName = studentName;
		this.studentID = studentID;
		korea=new Subject();
		math=new Subject();
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public Subject getKorea() {
		return korea;
	}

	public void setKorea(String subjectName, int score, int subjectID) {
		korea.setSubjectName(subjectName);
		korea.setScore(score);
		korea.setSubjectID(subjectID);
	}

	public Subject getMath() {
		return math;
	}

	public void setMath(String subjectName, int score, int subjectID) {
		math.setSubjectName(subjectName);
		math.setScore(score);
		math.setSubjectID(subjectID);
	}
	
	public void showStudentScore() {
		int total = korea.getScore()+math.getScore();
		System.out.println(studentID+" : "+studentName+"학생의 수학 수강과목 : "
		+ math.getSubjectID()+" : "+math.getSubjectName()+"->"+math.getScore()+"점과 국어 수강과목 : "
		+korea.getSubjectID()+" : "+korea.getSubjectName()+"->"+korea.getScore()+ "점의 총합점수는"
		+total+"점 입니다.");
	}
	
	
	
}
