package buoi8.designpatterndao.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import buoi8.designpatterndao.dao.BookDao;
import buoi8.designpatterndao.obj.Book;
import buoi8.designpatterndao.util.Constant;
import buoi8.designpatterndao.util.DBConnection;

public class BookDaoImpl implements BookDao{
	
	@Override
	public int insertBook(Book book) {
		if (book == null) {
			return Constant.WRONG_INPUT_RESULT;
		}
		Connection con = DBConnection.getInstance().getConnection();
		String sql = "insert into book(name, description, title, author, publish ) values (?, ? , ?, ?, ?)";
		PreparedStatement ps = null;
	    try {
	    	ps = con.prepareStatement(sql);
	    	ps.setString(1, book.getName());
	    	ps.setString(2, book.getDescription());
	    	ps.setString(3, book.getTitle());
	    	ps.setString(4, book.getAuthor());
	    	ps.setInt(5, book.getPublish());
	    	int res = ps.executeUpdate();
	    	ps.close();
	    	if (res > 0) {
	    		return Constant.SUCCESS_RESULT;
	    	}
	    }catch(Exception e) {
	    	// ghi log
	    	e.printStackTrace();
	    }
		
		DBConnection.closeConnection(con);
		return Constant.FAIL_RESULT;
	}

	@Override
	public int updateBook(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBook(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return null;
	}

}
