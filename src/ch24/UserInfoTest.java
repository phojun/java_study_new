package ch24;
//키가 180 이고 몸무게가 78 킬로인 남성이 있습니다. 이름은 Tomas 이고 나이는 37세입니다.
public class UserInfoTest {
	public static void main(String[] args) {
		
		UserInfo tom_Info=new UserInfo(180, 78, 37,"Tom");
		
		System.out.println(tom_Info.toString());
		
		
	}
}
