package ch35;

public class TwoDimensionTest {
	
	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] arr = { {1,2,3}, {4,5,6,7}};
		
		int i,j;
		for(i=0; i<arr.length;i++) {
			for(j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println("\t"+arr[i].length);
		}
	}

}
