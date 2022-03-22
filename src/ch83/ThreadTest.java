package ch83;

class MyThread extends Thread{
	//critical section에 대한 동기화가 쓰레드 사용의 최대 관건
	public void run() {// 쓰레드가 시작이 되면 불리는 메서드
		
		int i;
		for(i = 0; i<=200; i++) {
			System.out.print(i + "\t");
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + "start");
		MyThread th1 = new MyThread();
		th1.start();
		
		MyThread th2 = new MyThread();
		th2.start();

		System.out.println(Thread.currentThread() + "end");

	}

}
