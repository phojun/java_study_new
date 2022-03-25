package ch84.syncronize;

class Bank1 {
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void saveMoney(int save) {// 현재 이 메서드가 속해있는 객체에 lock을 건다.

		int m = getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m + save);

	}

	public void minusMoney(int minus) {// 현재 이 메서드가 속해있는 객체에 lock을 건다.
		int m = getMoney();
		try {
			Thread.sleep(300);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m - minus);
	}

	@Override
	public String toString() {
		return "Bank [money=" + money + "]";
	}

}

class Park1 extends Thread {

	public void run() {
		//쓰레드 안에 걸기
		synchronized (SyncMain2.myBank) {
			System.out.println("start save");
			SyncMain2.myBank.saveMoney(3000);
			System.out.println("saveMoney(3000) : " + SyncMain2.myBank.getMoney());
		}
		
	}

}

class ParkWife1 extends Thread{
	
	public void run() {
		synchronized(SyncMain2.myBank) {
			System.out.println("start minus");
			SyncMain2.myBank.minusMoney(1000);
			System.out.println("minusMoney(1000) : " + SyncMain2.myBank.getMoney());
		}
	}
	

	
}

public class SyncMain2 {

	public static Bank1 myBank = new Bank1();

	public static void main(String[] args) {

		Park1 p = new Park1();
		ParkWife1 pw = new ParkWife1();
		pw.start();
		

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		p.start();

	}
}
