package buoi7.truutuong;

import java.util.ArrayList;
import java.util.Scanner;
import buoi6.kethua.*;
public class MainMGR {
	//public static ArrayList<People> danhsach;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cf = "";
		ArrayList<People> list = new ArrayList<People>();
		do {
			int s = 0;
			showMenu();
			s = sc.nextInt();
			sc.nextLine();
			switch (s) {
				case 1:
					addNewStudent(list);
					break;
				case 2:
					addNewEmployeeFullTime(list);
					break;
				case 3:
					addNewEmployeeParttime(list);
					break;
				case 4:
					break;
				case 5:
					
					break;
				case 6:
								
					break;
				case 7:
					
					break;
				case 8:
					
					break;
				case 9:
					
					break;
			}
			System.out.println("ban co muon tiep tuc khong: ");
			cf=sc.nextLine();
		}while(cf.equals("y"));
	}
	public static void showMenu() {
		System.out.println("* Xay dung chuong trinh quan ly nhan su:");
		System.out.println("* 1. Them Student");
		System.out.println("* 2. Them EmployeeFullTime");
		System.out.println("* 3. Them EmployeePartTime");
		System.out.println("* 4. Tim ds people ki nhap name");
		System.out.println("* 5. Hien thi danh sach people theo xep loai: Student, Fulltime, Parttime kem so luong");
		System.out.println("* 6. Nguoi dung nhap loai nhan su can tim kiem tu ban phim (1.student,2.fulltime,3.parttime),hien thi danh sach nhan su theo loai");
		System.out.println("* 7. Nhap masv, xac dubg xen ci tib tau sv trong danh sach hay khong");
		System.out.println("* 8. su dung thuat toan sap xep mang, sap xep danh sach Employee theo tang dan cua tong luong");
		System.out.println("* 9. Thoat");
	}
	// tao ham case 1. Them Student
	public static void addNewStudent(ArrayList<People> list) {
		People p = new People();
		p.input(new Scanner(System.in));
		list.add(p);
	}
	// case 2 2. Them EmployeeFullTime
	public static void addNewEmployeeFullTime(ArrayList<People> list) {
		EmployeeFulltime p = new EmployeeFulltime();
		p.input(new Scanner(System.in));
		list.add(p);
	}
	// case 3. Them EmployeeParttime
	public static void addNewEmployeeParttime(ArrayList<People> list) {
		
	}
	// 4. Tim ds People khi nhap name tu ban phim
	public static void findByName() {
		
	}
	// 5. Hien thi danh sach People theo sap xep loai: Student, FullTime, PartTime kem so luong
	

}
