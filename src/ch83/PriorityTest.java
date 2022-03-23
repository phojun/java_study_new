package ch83;

class PriorityThread extends Thread{
	
	public PriorityThread(String name) {
		super(name);
	}
	
	//우선 순위가 높은 Thread가 CPU의 배분을 받을 (확률)이 높다
	public void run(){
		
		System.out.println(Thread.currentThread().getName()+" start");
		int sum = 0;
		for(int i =0; i<=10; i++){
			
			sum+=i;
		}
		
		System.out.println("sum = "+sum+Thread.currentThread().getName()+" end");
		
	
	}
}


public class PriorityTest {

	public static void main(String[] args) {

		PriorityThread pt1 = new PriorityThread("우선순위가 낮은 스레드");
		PriorityThread pt2 = new PriorityThread("우선순위가 높은 스레드");
		PriorityThread pt3 = new PriorityThread("우선순위가 중간인 스레드");
		
		pt1.setPriority(Thread.MIN_PRIORITY);
		pt2.setPriority(Thread.MAX_PRIORITY);
		pt3.setPriority(Thread.NORM_PRIORITY);
		
		pt1.start();
		pt2.start();
		pt3.start();
	}

}
