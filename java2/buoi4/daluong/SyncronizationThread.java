package buoi4.daluong;

public class SyncronizationThread {

	public static void main(String[] args) {
		System.out.println("Start Main");
		Account account = new Account(10000);
		
		AccountThread t1 = new AccountThread(account, "T1");
		AccountThread t2 = new AccountThread(account, "T2");
		AccountThread t3 = new AccountThread(account, "T3");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("End Main");
	}

}
class Account{
	long sotien;
	public Account(long sotien) {
		this.sotien = sotien;
	}
	public void rutTien(long sotienRut, String nguoiRut) {
		synchronized (this) {
			if (sotien >= sotienRut) {
				long conlai = sotien - sotienRut;
				System.out.println(nguoiRut + " rut "+ sotienRut 
						+ " trong " + sotien + "; tk con lai: "+ conlai);
				sotien = conlai;
			} else {
				System.out.println(nguoiRut + " khong du de rut tk co "+ sotien);
			}
		}
		System.out.println(nguoiRut);
		System.out.println(nguoiRut);
		System.out.println(nguoiRut);
	}
}
class AccountThread extends Thread {
	Account acc;
	String name;
	public AccountThread(Account acc, String name) {
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