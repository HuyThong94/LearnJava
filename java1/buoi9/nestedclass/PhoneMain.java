package buoi9.nestedclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneMain {

	public static void main(String[] args) {
		ArrayList<Phone> danhba = new ArrayList<Phone>();
		danhba.add(new Phone("DungPT", "0126698"));
		danhba.add(new Phone("AnhNT", "12548"));
		danhba.add(new Phone("PhuongHT", "12548"));
		danhba.add(new Phone("HaiLT", "12358"));
		System.out.println("Danh sach truoc sap xep:");
		for(Phone p : danhba) {
			System.out.println("Name: "+ p.getName() + "; phone: "+ p.getPhoneNumber());
		}
		// thuan toan sap xep
		/*
		for (int i=0; i< danhba.size(); i++) {
			for (int j=0; j < danhba.size()-i -1; j++) {
				Phone p1 = danhba.get(j);
				Phone p2 = danhba.get(j+1);
				// neu p2 > p1 -> doi cho
				// sap xep tang dan
				if (p1.getName().compareTo(p2.getName()) > 0) {
					// ham cap nhat -> c1
					//danhba.set(j, p2);
					//danhba.set(j+1, p1);
					
					// su dung ham doi cho -> c2
					Collections.swap(danhba, j, j+1);
				}
			}
		}
		*/
		// sap xep dua vao Comparable
		//Collections.sort(danhba);
		// sap xep dua vao Comparetor
		Collections.sort(danhba, new Comparator<Phone>() {

			@Override
			public int compare(Phone o1, Phone o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println("In danh sach tang dan ten:");
		for(Phone p : danhba) {
			System.out.println("Name: "+ p.getName() + "; phone: "+ p.getPhoneNumber());
		}
		// sap xep giam dan
		Collections.sort(danhba, new PhoneSortByNameDesc());
		System.out.println("In danh sach giam dan ten:");
		for(Phone p : danhba) {
			System.out.println("Name: "+ p.getName() + "; phone: "+ p.getPhoneNumber());
		}
		// sap xep tang dan theo number
		Collections.sort(danhba, new PhoneSortByNumber());
		System.out.println("In danh sach tang dan theo number:");
		for(Phone p : danhba) {
			System.out.println("Name: "+ p.getName() + "; phone: "+ p.getPhoneNumber());
		}
	}

}
