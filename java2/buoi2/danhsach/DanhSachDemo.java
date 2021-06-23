package buoi2.danhsach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import buoi1.ngoaile.TaiKhoan;

public class DanhSachDemo {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		List list = new ArrayList();
		list.add(1);
		list.add(true);
		list.add(new TaiKhoan());
		
		ArrayList<String> listName = new ArrayList<String>();
		// them moi
		listName.add("dung");
		listName.add("anh");
		listName.add("Bao");
		listName.add("dung");
		listName.add("anh");
		System.out.println("size list: "+ listName.size());
		System.out.println("Lay ra 1 phan tu index = 2 trong list: "+ listName.get(2));
		// hien thi danh sach:
		// lay qua index
		System.out.println("Duyet qua chi muc");
		for(int i=0; i< listName.size(); i++) {
			System.out.println(listName.get(i));
		}
		// foreach
		System.out.println("Duyet foreach");
		for(String temp : listName) {
			System.out.println(temp);
		}
		Iterator<String> iterator = listName.iterator();
		// duyet qua iterator
		System.out.println("Duyet iterator");
		while(iterator.hasNext()) {
			// lay ra 1 phan tu
			String temp = iterator.next();
			System.out.println(temp);
		}
		ListIterator<String> listIterator = listName.listIterator();
		// duyet qua listiterator
		System.out.println("Duyet List iterator");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		HashSet<String> setName = new HashSet<String>();
		System.out.println(setName.add("dung"));
		setName.add("anh");
		setName.add("Bao");
		System.out.println(setName.add("dung"));
		setName.add("anh");
		System.out.println("size set: "+ setName.size());
		System.out.println("Duyet set foreach");
		for(String temp : setName) {
			System.out.println(temp);
		}
		System.out.println("Duyet set iterator");
		Iterator<String> iter = setName.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// map
		HashMap<String, TaiKhoan> mapTk = new HashMap<String, TaiKhoan>();
		// them 1 phan tu vao map
		mapTk.put("001", new TaiKhoan());
		mapTk.put("002", new TaiKhoan("", "", 1, "001", "aaa", new Date(), new Date(), 111));
		System.out.println("size map: "+ mapTk.size());
		System.out.println("Lay value cua phan tu ma 001: "+ mapTk.get("001"));
		mapTk.put("001", new TaiKhoan("", "", 1, "001", "aaa", new Date(), new Date(), 111));
		System.out.println("size map: "+ mapTk.size());
		System.out.println("Duyet theo set");
		Set<String> keyMap = mapTk.keySet();
		for(String key  : keyMap) {
			System.out.println(key + ": "+ mapTk.get(key));
		}
		System.out.println("Duyet foreach");
		Set<Map.Entry<String, TaiKhoan>> setTk = mapTk.entrySet();
		Iterator<Map.Entry<String, TaiKhoan>> iterTk = setTk.iterator();
		while (iterTk.hasNext()) {
			Map.Entry<String, TaiKhoan> apart = iterTk.next();
			System.out.println(apart.getKey() + ": "+ apart.getValue());
		}
		
		Set<Integer> setMaSv = new HashSet<Integer>();
		setMaSv.add(1);
		
	}

}
