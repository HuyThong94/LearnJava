package buoi4.daluong;

public class LuongCoBan {

	public static void main(String[] args) {
		System.out.println("Start Main");
		Thread threadMain = Thread.currentThread();
		System.out.println("threadMain state: "+ threadMain.getState()+"; priority: "+ threadMain.getPriority());
		// tao 1 luong
		// c1
		MyThread t1 = new MyThread(); // t1 -> luong
		System.out.println("1.1.T1 state: "+t1.getState());
		// c2
		ThreadImp ti = new ThreadImp(t1);
		Thread t2 = new Thread(ti);
		System.out.println("2.1.T2 state: "+t2.getState());
		t1.start();
		System.out.println("1.2.T1 state: "+t1.getState()+"; priority: "+ threadMain.getPriority());
		t2.start();
		System.out.println("2.2.T2 state: "+t2.getState()+ "; priority: "+ threadMain.getPriority());
		// chuyen tu trang thai running -> sleep
		// ngu trong 1 khoang thoi gian roi day tiep tuc thuc hien
		/*
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		// muon luong t1 chay xong thi luong Main moi chay tiep
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// luong t2 chay xong thi luong Main moi chay tiep
		/*
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		System.out.println("End Main");
	}

}
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=50; i< 60; i++) {
			System.out.println("T1:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class ThreadImp implements Runnable{
	Thread other;
	public ThreadImp(Thread t) {
		this.other = t;
	}
	public void run() {
		try {
			other.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=0; i< 10; i++) {
			System.out.println("T2:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}