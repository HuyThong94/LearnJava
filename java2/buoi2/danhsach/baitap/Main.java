package buoi2.danhsach.baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// nhap danh sach sinh vien
		SinhVienDao.addSV();
		
		// in ds sv:
		System.out.println("----Hien thi danh sach sinh vien ---");
		SinhVienDao.inSV();
		Collections.sort(SinhVienDao.DSSV);
		System.out.println("----Hien thi danh sach sinh vien da sap xep tang dan ---");
		SinhVienDao.inSV();
		
		// sap xep giam dan theo tensv, manganh,masv
		Comparator<SinhVien> sosanh1 = new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				if (o2.getTenSv() != null && o2.getTenSv().equals(o1.getTenSv())) {
					if (o2.getMaNganh().equals(o1.getMaNganh())) {
						return Integer.compare(o2.getMaSv(), o1.getMaSv());
					} else 
						return o2.getMaNganh().compareTo(o1.getMaNganh());
				} else 
					return o2.getTenSv().compareTo(o1.getTenSv());
			}
		};
		Collections.sort(SinhVienDao.DSSV, sosanh1);
		System.out.println("----Hien thi danh sach sinh vien da sap xep giam dan ---");
		SinhVienDao.inSV();
		
		// Hien thi ten sv khong trung nhau
		HashSet<String> tenSVSet = (HashSet<String>) SinhVienDao.convertListToSetTen();
		// duyet set:
		System.out.println("------Hien thi cac ten sv khong trung nhau-------");
		for(String tensv : tenSVSet) {
			System.out.println(tensv);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma nganh can tim sinh vien: ");
		String maNganhSearch = sc.nextLine();
		ArrayList<SinhVien> listTheoNganh = SinhVienDao.MAPSV.get(maNganhSearch);
		System.out.println("Sinh vien theo nganh "+ maNganhSearch);
		for(SinhVien sv : listTheoNganh) {
			sv.xuat();
		}
		if (listTheoNganh == null || listTheoNganh.size() == 0) {
			System.out.println("Nganh nay khong co sinh vien.");
		}
	}

}
