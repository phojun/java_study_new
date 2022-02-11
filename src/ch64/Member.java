package ch64;

import java.util.Comparator;

public class Member implements Comparator<Member>{
	
	private int memberId;        //회원 아이디
	private String memberName;   //회원 이름
	
	public Member() {
		
	}

	public Member(int memberId, String memberName){ //생성자
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {  
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

	@Override
	public String toString(){   //toString 메소드 오버로딩
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
	}

	@Override
	public int compare(Member m1, Member m2) {
		//오름차순
		//return (m1.memberId - m2.memberId);
		//내림차순
		return (m2.memberId - m1.memberId);
	}

}
