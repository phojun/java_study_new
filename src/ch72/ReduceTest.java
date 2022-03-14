package ch72;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String t, String u) {
		if(t.getBytes().length >= u.getBytes().length) {
			return t;
		}else {
			return u;
		}
	}
	
}
public class ReduceTest {

	public static void main(String[] args) {
		String greetings[] = { "안녕하세요~~", "Hello", "Good Morning!!!!!!", "반갑습니다아^^" };

		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			} else {
				return s2;
			}
		}

		));
		
		System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());
		

	}

}
