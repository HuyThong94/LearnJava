package buoi3;

import java.util.Scanner;

public class Calculator {
	// field
	int num1;
	int num2;
	
	// method
	void nhap(Scanner sc) {
		System.out.println("Nhap so thu 1: ");
		num1 = sc.nextInt();
		System.out.println("Nhap so thu 2: ");
		num2 = sc.nextInt();
	}
	
	
	void tong() {
		System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
	}
	void hieu() {
		System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
	}
	String nhan() {
		//System.out.printf("%d * %d = %d\n", num1, num2, (num1 - num2));
		return num1 + " * "+ num2 + " = "+ (num1 * num2);
	}
	void thuong() {
		System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
	}
	void layDu() {
		System.out.println(num1 +" % " + num2 + " = "+ (num1 % num2));
	}
	void luyThua() {
		int kq = 1;
		for (int i=1; i<= num2; i++) {
			kq *= num1;
		}
		System.out.printf("%d ^ %d = %d\n", num1, num2, kq);
	}
	
	void tinhToan() {
		tong();
		hieu();
		System.out.println(nhan());
		thuong();
		layDu();
		luyThua();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// tao doi tuong:
		Calculator cal = new Calculator();
		cal.nhap(sc);
		cal.tinhToan();
	}

}
