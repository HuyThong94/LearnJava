package buoi2.danhsach.baitap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class SinhVienDao {
	// chua danh sach sinh vien
	static ArrayList<SinhVien> DSSV = new ArrayList<SinhVien>();
	// chua danh sach cac ma sinh vien khong trung nhau
	static HashSet<Integer> MASVSET = new HashSet<Integer>();
	
	// danh sach chua cac phan tu la <manganhhoc,List<Sinhvien>>
	static Hashtable<String, ArrayList<SinhVien>> MAPSV = new Hashtable<String, ArrayList<SinhVien>>();
	
	public static void addSV() {
		String confirm = "";
		Scanner sc = new Scanner(System.in);
		do {
			SinhVien sv = new SinhVien();
			sv.nhap(sc);
			DSSV.add(sv);
			MASVSET.add(sv.getMaSv());
			if (MAPSV.containsKey(sv.getMaNganh())) {
				ArrayList<SinhVien> list = MAPSV.get(sv.getMaNganh());
				list.add(sv);
				MAPSV.put(sv.getMaNganh(), list);
			} else {
				ArrayList<SinhVien> list = new ArrayList<SinhVien>();
				list.add(sv);
				MAPSV.put(sv.getMaNganh(), list);
			}
			System.out.println("Them 1 sinh vien thanh cong vao danh sach/"+ DSSV.size());
			System.out.println("Ban muon tao moi 1 sinh vien nua khong (y: tiep tuc)?");
			confirm = sc.nextLine();
		}while (confirm.equals("y"));
	}
	public static void inSV() {
		Iterator<SinhVien> iter = DSSV.iterator();
		while(iter.hasNext()) {
			SinhVien sv = iter.next();
			sv.xuat();
		}
	}
	// chuyen List sv ve danh sach chua cac ten sv khong trung nhau
	public static Set<String> convertListToSetTen(){
		HashSet<String> tenSvSet = new HashSet<String>();
		ListIterator<SinhVien> list = DSSV.listIterator();
		while (list.hasNext()) {
			tenSvSet.add((list.next()).getTenSv());
		}
		return tenSvSet;
	}
}
