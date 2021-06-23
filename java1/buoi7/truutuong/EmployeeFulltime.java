package buoi7.truutuong;

import java.util.Scanner;

/*
 * Luong fulltime = baseUnit * baseSalary + insuaranceUnit * baseSalary * 0.12;
 * */
public class EmployeeFulltime extends Employee{
	private float baseUnit;
	private float insuaranceUnit;
	public static final float percentUnit = 0.12f;
	
	public EmployeeFulltime() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeFulltime(String name, int age, String address, String empNo, float baseSalary) {
		super(name, age, address, empNo, baseSalary);
		// TODO Auto-generated constructor stub
	}
	public EmployeeFulltime(String name, int age, String address, String empNo, float baseSalary, float baseUnit,
			float insuaranceUnit) {
		super(name, age, address, empNo, baseSalary);
		this.baseUnit = baseUnit;
		this.insuaranceUnit = insuaranceUnit;
	}
	

	public float getBaseUnit() {
		return baseUnit;
	}
	public void setBaseUnit(float baseUnit) {
		this.baseUnit = baseUnit;
	}
	public float getInsuaranceUnit() {
		return insuaranceUnit;
	}
	public void setInsuaranceUnit(float insuaranceUnit) {
		this.insuaranceUnit = insuaranceUnit;
	}
	
	@Override
	public void input(Scanner sc) {
		// TODO Auto-generated method stub
		super.input(sc);
		System.out.println("He so luong: ");
		this.baseUnit = sc.nextFloat();
		System.out.println("He so luong bao hiem: ");
		this.insuaranceUnit = sc.nextFloat();
		sc.nextLine();
	}
	@Override
	public String output() {
		// TODO Auto-generated method stub
		return super.output() + "; Base Unit: "+ this.baseUnit + "; Insuarance Unit: "+ this.insuaranceUnit;
	}
	@Override
	public double calSalary() {
		//fulltime = baseUnit * baseSalary + insuaranceUnit * baseSalary * 0.12;
		return this.baseUnit * super.getBaseSalary() + this.insuaranceUnit * super.getBaseSalary() * percentUnit;
	}

}
