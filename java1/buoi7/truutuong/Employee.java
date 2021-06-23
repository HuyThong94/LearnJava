package buoi7.truutuong;

import java.util.Scanner;

import buoi6.kethua.People;
// class chua it nhat 1 ham abstract -> class do phai la class abstract

public abstract class Employee extends People{
	private String empNo;
	private float baseSalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, String address) {
		super(name, age, address);
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, String address, String empNo, float baseSalary) {
		super(name, age, address);
		this.empNo = empNo;
		this.baseSalary = baseSalary;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public float getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}
	// ham truu tuong la ham co them tu khoa abstract -> ham khai bao khong co than ham
	public abstract double calSalary();
	@Override
	public void input(Scanner sc) {
		// TODO Auto-generated method stub
		super.input(sc);
		System.out.println("Emp No: ");
		this.empNo = sc.nextLine();
		System.out.println("Base Salary: ");
		this.baseSalary = sc.nextFloat();
		sc.nextLine();
	}
	@Override
	public String output() {
		// TODO Auto-generated method stub
		return super.output() + "; Emp No: "+ this.empNo + "; BaseSalary: "+ this.baseSalary;
	}
	
	
}
