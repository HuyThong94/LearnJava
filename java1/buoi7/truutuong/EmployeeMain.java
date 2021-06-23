package buoi7.truutuong;

import java.util.Scanner;

import buoi6.kethua.People;
import buoi6.kethua.Student;
/*
 * Xay dung chuong trinh quan ly nhan su:
 * 1. Them Student
 * 2. Them EmployeeFullTime
 * 3. Them EmployeeParttime
 * 4. Tim ds People khi nhap name tu ban phim
 * 5. Hien thi danh sach People theo sap xep loai: Student, FullTime, PartTime kem so luong
 * 6. Nguoi dung nhap loai nhan su can tim kiem tu ban phim (1. Student, 2. FullTime, 3. Parttime ), 
 * hien thi danh sach nhan su theo loai
 * 7. Nhap masv, xac dinh xem co ton tai sv trong danh sach hay khong
 * 8. Su dung thuat toan sap xep mang, sap xep danh sach Employee theo tang dan cua tong luong
 * 9. Thoat
 * 
 * */
public class EmployeeMain {

	public static void main(String[] args) {
		People p = new People();
		Student s = new Student();
		// cac class abstract thi khong khoi tao duoc doi tuong -> ko dung voi toan tu new;
		//Employee e = new Employee();
		EmployeeFulltime f1 = new EmployeeFulltime();
		Employee f2 = new EmployeeFulltime();
		People f3 = new EmployeeFulltime();
		EmployeeParttime f4 = new EmployeeParttime();
//		f1.input(new Scanner(System.in));
//		System.out.println(f1.output());
//		System.out.println("Luong: "+ f1.calSalary());
		
		f4.input(new Scanner(System.in));
		System.out.println(f4.output());
		System.out.println("Luong: "+ f4.calSalary());
		
	}

}
