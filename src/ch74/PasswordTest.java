package ch74;

public class PasswordTest {
	
	private String pw;
	
	public void setPw(String pw) throws PasswordException {
		if(pw==null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}else if(pw.length()<5) {
			throw new PasswordException("비밀번호는 5자리 이상이어야 합니다.");
		}else if(pw.matches("[a-zA-Z]+")){
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}else {
			this.pw=pw;
		}
	}
	public String getPw() {
		return pw;
	}

	public static void main(String[] args) {
		
		PasswordTest pwTest = new PasswordTest();
		
		String pw = null;
		try {
			pwTest.setPw(pw);
			System.out.println("오류없음 1");
		}catch(PasswordException e) {
			System.out.println(e);
		}
		System.out.println("end1");
		
		pw = "abc";
		try {
			pwTest.setPw(pw);
			System.out.println("오류없음 2");
		}catch(PasswordException e) {
			System.out.println(e);
		}
	
		System.out.println("end2");
		
		pw = "abcde";
		try {
			pwTest.setPw(pw);
			System.out.println("오류없음 3");
		}catch(PasswordException e) {
			System.out.println(e);
		}
	
		System.out.println("end3");
		

		pw = "abcde12";
		try {
			pwTest.setPw(pw);
			System.out.println("오류없음 4");
		}catch(PasswordException e) {
			System.out.println(e);
		}
	
		System.out.println("end4");

	}

}
