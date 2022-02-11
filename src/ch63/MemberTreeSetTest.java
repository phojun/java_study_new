package ch63;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		return o1.compareTo(o2)*-1;
	}
	
}

public class MemberTreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();

		set.add("홍길동");
		set.add("강감찬");
		set.add("이순신");

		System.out.println(set);

		MemberTreeSet memberTreeSet = new MemberTreeSet(new MyCompare());

		
		Member memberKim = new Member(1002, "김유신");
		Member memberLee = new Member(1001, "이순신");
		Member memberKang = new Member(1003, "강감찬");

		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);

		memberTreeSet.showAllMember();


	}

}
