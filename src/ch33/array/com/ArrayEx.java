package ch33.array.com;

public class ArrayEx {
	public static void main(String[] args) { 
		//배열 생성 
		int[] arr=new int[10];
		int total = 0; 
		
		for(int i=0, num=1;  i<arr.length; i++) {
			arr[i]=num++;

		}
		//향상된 for문
		for(int num : arr) { 
			System.out.println(num);
			  total+=num; 
		}
		  
		System.out.println(total);
	}
	
	
}
