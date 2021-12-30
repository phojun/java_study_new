package ch30.example.staticEx;

public class EmployeeTest {
	public static void main(String[] args) {
		//System.out.println(Employee.getSerialNum());
		Employee employeeLee=new Employee();
		employeeLee.setEmployeeName("이순신");
		System.out.println(employeeLee.getEmployeeID());
		//System.out.println(Employee.getSerialNum());
		
		Employee employeekim=new Employee();
		employeekim.setEmployeeName("김씨");
		System.out.println(employeekim.getEmployeeID());
		
		System.out.println(employeeLee.toString());
		System.out.println(employeekim.toString());
		
		//System.out.println(Employee.getSerialNum());//클래스 이름으로 호출 가능
		
	}
}
