package buoi3;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// tao doi tuong de su dung:
		int num = 1;
		// tao ra 1 doi tuong moi kieu Student
		Student hoang = new Student();
		System.out.println("1. Ten: "+ hoang.name + "; tuoi: "+ hoang.age + "; diachi: "+ hoang.address);
		// gan cac thong tin dac diem cho 1 doi tuong
		hoang.name = "Hoang";
		hoang.age = 18;
		hoang.address = "Ha Noi";
		hoang.phone = "097832";
		System.out.println("2. Ten: "+ hoang.name + "; tuoi: "+ hoang.age + "; diachi: "+ hoang.address);
		hoang.print();
		
		// tao 1 doi tuong moi
		Student son = new Student();
		/*
		son.name = "Son";
		son.age = 21;
		son.address= "Hai Duong";
		son.phone = "012549";
		*/
		son.createStudent(sc);
		//System.out.println("Son. Ten: "+ son.name + "; tuoi: "+ son.age + "; diachi: "+ son.address);
		son.print();
		
		Student duong = son;
		duong.createStudent(sc);
		//System.out.println("Duong. Ten: "+ duong.name + "; tuoi: "+ duong.age + "; diachi: "+ duong.address);
		duong.print();
		// khi su dung doi tuong thi phai tranh gia tri null
		/*
		Student empty = null;
		empty.name = "aaa";
		System.out.println("Empty. Ten: "+ empty.name + "; tuoi: "+ empty.age + "; diachi: "+ empty.address);
		*/
		
	}

}
