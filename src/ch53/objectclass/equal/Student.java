package ch53.objectclass.equal;

public class Student implements Cloneable{
	
	private int stdNum;
	private String stdName;
	
	public Student(int stdNum, String stdName) {
		super();
		this.stdNum = stdNum;
		this.stdName = stdName;
	}
	
	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}



	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.stdNum == std.stdNum) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}

	@Override
	public String toString() {
		return "Student [stdNum=" + stdNum + ", stdName=" + stdName + "]";
	}

	@Override
	public int hashCode() {
		return stdNum;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	

}
