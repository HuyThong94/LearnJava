package buoi8.designpatterndao;

import java.util.ArrayList;
import java.util.List;

import buoi8.designpatterndao.dao.BookDao;
import buoi8.designpatterndao.dao.impl.BookDaoImpl;
import buoi8.designpatterndao.obj.Book;
import buoi8.designpatterndao.util.Constant;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		BookDao bookDao = new BookDaoImpl();
		// tao doi tuong book can insert
		Book book = new Book(0, "Cuon theo chieu gio", "sach hay", "Cuon theo chieu gio", "Dung", 1980);
		
		// them moi
		int result = bookDao.insertBook(book);
		if (result == Constant.SUCCESS_RESULT) {
			System.out.println("Them moi sach thanh cong");
		} else {
			System.out.println("Them moi sach that bai");
		}
		
	}

}
