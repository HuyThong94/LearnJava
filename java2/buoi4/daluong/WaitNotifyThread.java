package buoi4.daluong;

public class WaitNotifyThread {

	public static void main(String[] args) {
		System.out.println("Start");
		NapRutAccount account = new NapRutAccount(10000);
		
		RutThread rut1 = new RutThread(account, "R1");
		RutThread rut2 = new RutThread(account, "R2");
		RutThread rut3 = new RutThread(account, "R3");
		
		NapThread nap = new NapThread(account, "N");
		rut1.start();
		rut2.start();
		rut3.start();
		nap.start();
		
		
		System.out.println("End");
	}

}
class NapRutAccount{
	long sotien;
	public NapRutAccount(long sotien) {
		this.sotien = sotien;
	}
	public synchronized void rutTien(long sotienRut, String nguoiRut) {
		while (sotien < sotienRut) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (sotien >= sotienRut) {
			long conlai = sotien - sotienRut;
			System.out.println(nguoiRut + " rut "+ sotienRut 
					+ " trong " + sotien + "; tk con lai: "+ conlai);
			sotien = conlai;
		} 
	}
	public synchronized void napTien(long sotienNap, String nguoiNap) {
		this.sotien += sotienNap;
		System.out.println(nguoiNap + " nap "+ sotienNap + ", tk co: "+ this.sotien);
		this.notifyAll();
	}
}
class NapThread extends Thread{
	NapRutAccount acc;
	String name;
	public NapThread(NapRutAccount acc, String name) {
		this.acc = acc;
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0; i< 4; i++) {
			acc.napTien(2000, name);
			// ngu 5s
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class RutThread extends Thread{
	NapRutAccount acc;
	String name;
	public RutThread(NapRutAccount acc, String name) {
		this.acc = acc;
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0; i< 3; i++) {
			acc.rutTien(2000, name);
		}
	}
}