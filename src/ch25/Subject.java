package ch25;

public class Subject {
	
	private String subjectName;
	private int score, subjectID;

	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}
	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", score=" + score + ", subjectID=" + subjectID + "]";
	}
	
	
}
