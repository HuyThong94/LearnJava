package buoi3;

import java.util.Scanner;

public class Student {
	// tao field/ dac diem nhan dang 1 Student cu the
	// -> bien instance
	String name;
	int age;
	String address;
	String phone;
	
	
	// phuong thuc
	void createStudent(Scanner sc) {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		name = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap dia chi: ");
		address = sc.nextLine();
		System.out.println("Nhap so dien thoai: ");
		phone = sc.nextLine();
	}
	
	void print() {
		System.out.println("Ten: "+ name + "; tuoi: "+ age + "; address=" + address + "; phone="+ phone);
	}
	
}
