package day20;

class Bank{
	// 계좌의 돈
	private int money = 10000;
	// 입금
	//해당 메서드에 접근하면 접근하는동안 클래스전체에 접근못하게 막아주는 동기화 기능 (synchronized)
	public synchronized void saveMoney(int save) { 
		int m = this.money;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 대기시키는 함수 sleep(1000분의1초로 계산)
		
		setMoney(m+save);
	}	
	
	// 출금
	//해당 메서드에 접근하면 접근하는동안 클래스전체에 접근못하게 막아주는 동기화 기능 (synchronized)
	public synchronized void minusMoney(int minus) {
		
		int m = this.money;
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m-minus);
	}
	
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Hong extends Thread{
	public void run() { //입금
		System.out.println("입금시작~!!");
		SyncMain.myBank.saveMoney(3000); //3000원 입금
		System.out.println("3천원 입금 후 : "+SyncMain.myBank.getMoney());
	}
}
class HongWife extends Thread{
	public void run() { //출금
		System.out.println("출금시작~!!");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("1천원 출금 후 : "+SyncMain.myBank.getMoney());
	}
}

public class SyncMain {
	
	public static Bank myBank = new Bank(); // 공유영역 설정
	
	public static void main(String[] args) {
		
		HongWife hw = new HongWife();
		hw.start();
		
		Hong h = new Hong();
		h.start();
		
		
		
		
	}

}
