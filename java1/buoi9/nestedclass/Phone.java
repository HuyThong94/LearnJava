package buoi9.nestedclass;

import java.util.Comparator;

public class Phone implements Comparable<Phone>{
	private String name;
	private String phoneNumber;
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phone(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public int compareTo(Phone arg0) {
		System.out.println("Sap xep giua "+ this.getName() + " va "+ arg0.getName());
		return this.getName().compareTo(arg0.getName());
	}
}// end Phone
class PhoneSortByNameDesc implements Comparator<Phone>{

	@Override
	public int compare(Phone o1, Phone o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
	}
	
}
class PhoneSortByNumber implements Comparator<Phone>{

	@Override
	public int compare(Phone o1, Phone o2) {
		// TODO Auto-generated method stub
		return o1.getPhoneNumber().compareTo(o2.getPhoneNumber());
	}
	
}