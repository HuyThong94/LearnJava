package buoi9.nestedclass;

import buoi8.iinterface.IWork;

public class NestedMain {

	public static void main(String[] args) {
		Nguoi ng1 = new Nguoi();
		ng1.showInfo();
		// tao doi tuong member class
		Nguoi.DiaChi dc = new Nguoi().new DiaChi();
		Nguoi.DiaChi dc2 = ng1.new DiaChi("TP Ha Noi", "Cau Giay", "Dich Vong");
		System.out.println(dc2.toString());
		dc2.showOuterNguoi();
		
		// tao doi tuong static nested class
		Nguoi.ChungMinhThu cmt =new Nguoi.ChungMinhThu();
		Nguoi.ChungMinhThu cmt2 =new Nguoi.ChungMinhThu("12345676","01/01/2000","TP Ha Noi");
		System.out.println(cmt2.toString());
		
		ng1.setTen("DungPT");
		ng1.setAge(20);
		ng1.setDiachi(dc2);
		ng1.setCmt(cmt2);
		ng1.showInfo();
		ng1.checkVung();
		// anounymous - class nac danh/ class vo danh
		// -> dung cho interface va abstract class
		IWork giaovien = new IWork() {
			@Override
			public void doWork() {
				System.out.println("Giao vien 1 ngay lam viec 3 ca, sang, trua, chieu");
			}
		};
		giaovien.doWork();
		IWork congchuc = new IWork() {
			
			@Override
			public void doWork() {
				System.out.println("Cong chuc nha nuoc lam viec du 8 tieng tu 8h -> 17h ngay di lam");
			}
		};
		congchuc.doWork();
	}

}
