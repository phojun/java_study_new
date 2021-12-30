package ch30.example.staticEx;

public class Employee {
	
	private static int serialNum=1000;
	
	private int employeeID;
	private String employeeName;
	private String department;
	
	public Employee() {//인스턴스 생성시 사원에게 각각 다른 serialNum부여
		super();
		this.employeeID=serialNum;
		serialNum++;
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeID, String employeeName, String department) {
		super();
		this.employeeID = serialNum;
		this.employeeName = employeeName;
		this.department = department;
		serialNum++;
	}

	public static int getSerialNum() {//static 메서드 선언
		//employeeName="Lee";//static 메서드(클래스 메서드)에서는 인스턴스 변수를 사용할 수 없다
		return serialNum;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", department=" + department
				+ "]";
	}
	
	
	

}
