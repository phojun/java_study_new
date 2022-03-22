package ch83;

class RunnableThread implements Runnable{
	
	@Override
	public void run() {
		
		int i;
		for(i = 0; i<=200; i++) {
			System.out.print(i + "\t");
		}
	}
}
public class RunnableTest {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + "start");//메인스레드는 스레드를 생성하고 종료됨
		RunnableThread runnable = new RunnableThread();
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();

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
