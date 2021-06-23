package buoi8.designpatterndao.dao;

import java.util.List;

import buoi8.designpatterndao.obj.Book;

public interface BookDao {
	// khai bao cac phuong thuc lien quan toi thao tac doi tuong Book va bang Book trong db
	// them mới
	public int insertBook(Book book);
	// cap nhat
	public int updateBook(Book book);
	// xoa
	public int deleteBook(int id);
	// lay ra 1 book theo id -> xem chi tiet 1 book
	public Book getBookById(int id);
	// lay ra tat ca book
	public List<Book> getAllBook();
	
}
