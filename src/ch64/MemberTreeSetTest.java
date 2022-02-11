package ch64;

import java.util.TreeSet;



public class MemberTreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();

		set.add("홍길동");
		set.add("강감찬");
		set.add("이순신");

		System.out.println(set);

		MemberTreeSet memberTreeSet = new MemberTreeSet();

		
		Member memberKim = new Member(1002, "김유신");
		Member memberLee = new Member(1001, "이순신");
		Member memberKang = new Member(1003, "강감찬");

		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);

		memberTreeSet.showAllMember();


	}

}
