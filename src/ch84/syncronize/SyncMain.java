package ch84.syncronize;

class Bank{
	private int money = 10000;
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void saveMoney(int save) {//현재 이 메서드가 속해있는 객체에 lock을 건다.
		//블록방식
		synchronized (this) {
			int m = getMoney();
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			setMoney(m+save);
		}
		
	}
	//메서드 방식
	public synchronized void minusMoney(int minus) {//현재 이 메서드가 속해있는 객체에 lock을 건다.
		int m = getMoney();
		try {
			Thread.sleep(300);
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		setMoney(m-minus);
	}

	@Override
	public String toString() {
		return "Bank [money=" + money + "]";
	}
	
	
}

class Park extends Thread{
	
	public void run() {
		System.out.println("start save");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000) : " + SyncMain.myBank.getMoney());
	}
	
}
class ParkWife extends Thread{
	
	public void run() {
		System.out.println("start minus");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("minusMoney(1000) : " + SyncMain.myBank.getMoney());
	}
	
}

public class SyncMain {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) {
		
		Park p = new Park();
		p.start();
		
		try {
			Thread.sleep(200);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		ParkWife pw = new ParkWife();
		pw.start();
		
		System.out.println(myBank.toString());
	}
}
