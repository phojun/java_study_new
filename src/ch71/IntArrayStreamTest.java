package ch71;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
	public static void main(String[] args) {
	
		int arr[] = {1,2,3,4,5};
		
		/*
		 * for(int num : arr) { System.out.println(num); }
		 */
		
		//stream 활용
		
		
		Arrays.stream(arr).forEach(n->System.out.println(n));
		System.out.println("--------------------------------");
		
		IntStream is = Arrays.stream(arr);//
		System.out.println(is.count());
		System.out.println("--------------------------------");
		
		IntStream is2 = Arrays.stream(arr);
		System.out.println(is2.sum());
		System.out.println("--------------------------------");
		//System.out.println(is2.sum());한번 생성된 스트림은 소모 후  사라지기 때문에 오류 발생
	
	}

}
