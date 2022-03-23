package ch83;

public class JoinTest extends Thread {
	// 동시에 두 개 이상의 Thread가 실행 될 때 다른 Thread의 결과를
	// 참조 하여 실행해야 하는 경우 join() 함수를 사용
	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		int i;
		
		for(i=start; i<=end; i++) {
			total += i;
		}
		
	}

	public static void main(String[] args) {

		System.out.println(Thread.currentThread() + "start");
		JoinTest jt1 =new JoinTest(1, 50);
		JoinTest jt2 =new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		try {
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		int lastTotal = jt1.total+jt2.total;
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		
		System.out.println("lastTotal = " + lastTotal);
		System.out.println(Thread.currentThread() + "end");

	}

}
