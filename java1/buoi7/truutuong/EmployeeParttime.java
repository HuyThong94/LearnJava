package buoi7.truutuong;

import java.util.Scanner;

/*
 luong = workingDay * baseSalary;
 * */
public class EmployeeParttime extends Employee{
	private int workingDay;
	
	
	public EmployeeParttime() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmployeeParttime(String name, int age, String address, String empNo, float baseSalary) {
		super(name, age, address, empNo, baseSalary);
		// TODO Auto-generated constructor stub
	}

	public EmployeeParttime(String name, int age, String address, String empNo, float baseSalary, int workingDay) {
		super(name, age, address, empNo, baseSalary);
		this.workingDay = workingDay;
	}


	public int getWorkingDay() {
		return workingDay;
	}


	public void setWorkingDay(int workingDay) {
		this.workingDay = workingDay;
	}


	@Override
	public void input(Scanner sc) {
		
		super.input(sc);
		System.out.println("Working days: ");
		this.workingDay = sc.nextInt();
		sc.nextLine();
	}
	@Override
	public String output() {
		// TODO Auto-generated method stub
		return super.output()+ "; working days: "+ this.workingDay;
	}


	@Override
	public double calSalary() {
		return this.getBaseSalary()*this.workingDay;
	}

}
