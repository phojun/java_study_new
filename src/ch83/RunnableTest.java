package ch83;

class RunnableThread implements Runnable{
	int start;
	int end;
	int total;
	
	public RunnableThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread() + "start");
		for(int i = start; i<=end; i++) {
			total += i;
		}
		System.out.println(Thread.currentThread() + "end");
	}
}
public class RunnableTest {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + "start");//메인스레드는 스레드를 생성하고 종료됨
		RunnableThread runnable1 = new RunnableThread(1,50);
		RunnableThread runnable2 = new RunnableThread(51,100);
		Thread th1 = new Thread(runnable1);
		Thread th2 = new Thread(runnable2);
		
		th1.start();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("th1.total = " + runnable1.total);
		System.out.println("th2.total = " + runnable2.total);
		
		System.out.println(runnable1.total+runnable2.total);

		System.out.println(Thread.currentThread() + "end");
		
		
		//Runnable은 바로 익명 객체를 생성할 수 있다
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("runnable 1");
				
			}
		};
		
		run.run();
	}

}
