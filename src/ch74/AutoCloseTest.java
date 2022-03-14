package ch74;

public class AutoCloseTest {

	public static void main(String[] args) {
		AutoCloseableObj obj = new AutoCloseableObj();
		
		try(obj){
			throw new Exception();//예외 강제 발생
		}catch(Exception e) {
			System.out.println("예외 발생");
		}
		System.out.println("다음 명령 대기");

	}
//예외상황 혹은 정상 상황이어도 close 메서드는 항상 작동함
}
