package ch83;

class MyThread extends Thread{
	

	//critical section에 대한 동기화가 쓰레드 사용의 최대 관건
	public void run() {// 쓰레드가 시작이 되면 불리는 메서드
		try {
			for(int i = 0; i<=10; i++) {
				Thread.sleep(500);
				System.out.println("Thread : " + i);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();

		System.out.println(Thread.currentThread().getName() + "end");

	}

}
