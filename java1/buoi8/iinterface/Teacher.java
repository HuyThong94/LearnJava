package buoi8.iinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import buoi6.kethua.People;

public class Teacher extends People implements IInOut, IWork{
	private String teacherNo;
	private float teachHour;
	private ArrayList<String> teachClasses;
	public Teacher(String name, int age, String address, String teacherNo, float teachHour,
			ArrayList<String> teachClasses) {
		super(name, age, address);
		this.teacherNo = teacherNo;
		this.teachHour = teachHour;
		this.teachClasses = teachClasses;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, String address) {
		super(name, age, address);
		// TODO Auto-generated constructor stub
	}
	
	public String getTeacherNo() {
		return teacherNo;
	}

	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}

	public float getTeachHour() {
		return teachHour;
	}

	public void setTeachHour(float teachHour) {
		this.teachHour = teachHour;
	}

	public ArrayList<String> getTeachClasses() {
		return teachClasses;
	}
	public String getTeachClassesString() {
		// su dung StringBuilder va StringBuffer thay the cho viec cong chuoi cua String
		// StringBuffer su dung khi co thread
		StringBuilder sb = new StringBuilder();
		if (teachClasses != null)
		for (String s : this.teachClasses) {
			sb.append(s + ",");
		}
		String classes = sb.toString();
		classes= (classes.lastIndexOf(",") > -1)?classes.substring(0, classes.length() -1):"";
		/*
		String classes = "";
		for (String s : this.teachClasses) {
			classes += s + ",";
		}
		classes = (classes.lastIndexOf(",") > -1)?classes.substring(0, classes.length() -1):classes;
		*/
		return classes;
	}
	public void setTeachClasses(ArrayList<String> teachClasses) {
		this.teachClasses = teachClasses;
	}
	@Override
	public void inputData(Scanner sc) {
		super.input(sc);
		System.out.println("Teacher No:");
		this.teacherNo = sc.nextLine();
		System.out.println("Teach Hour: ");
		this.teachHour = sc.nextFloat();
		sc.nextLine();
		System.out.println("Teach Classes: ");
		String classes = sc.nextLine();
		// check chuoi chua dau phay , thi phan tach chuoi thanh mang
		if (classes != null) {
			// chia 1 chuoi chua cac dau phay thanh mang chua nhieu phan tu
			String[] s = classes.split(",");
			/*
			for (String s1 : s) {
				this.teachClasses.add(s1);
			}
			*/
			this.teachClasses = (ArrayList<String>) Arrays.asList(s);
		}
	}

	@Override
	public String outputData() {
		return super.output() + "; Teacher No: "+ this.teacherNo 
				+ "; Teach Hour: "+ this.teachHour 
				+ "; Teach classes: "+ this.getTeachClassesString();
		
	}

	@Override
	public void doWork() {
		System.out.println("Teacher ngay di lam >= 8 h");
		// kiem tra teacher ton tai hay khong? -> DB
		// neu ton tai? xem viec teacher la gi, gio day, lop hoc -> DB
		// luu thong tin day -> DB
		// luu log
	}
	

}
