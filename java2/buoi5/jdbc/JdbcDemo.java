package buoi5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		// cac thong tin can cho ket noi:
		String url = "jdbc:sqlserver://localhost:1433;instance=DESKTOP-NDQK039\\SQLEXPRESS2014;databaseName=T2007E_java2";
		String userName = "sa";
		String password = "123456";
		// B1: Tao connection
		
		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println("Connected!");
		
		// B2: tao doi tuong thuc thi lenh sql
		Statement st = con.createStatement();
		// b3: xu ly ket qua
		int id = 3;
		String name = "Jenni";
		String classcode = "T2007E";
		int ketqua = st.executeUpdate("insert into sinhvien (id, name, classcode) values ("+id+", N'"+name+"', '"+classcode+"')");
		if (ketqua > 0) {
			System.out.println("Them moi thanh cong");
		} else {
			System.out.println("Khong them moi thanh cong");
		}
		// b4: close connection:
		st.close();
		
		// -> Su dung preparedStatement:
		String sql = "insert into sinhvien (id, name, classcode) values (?, ?, ?)";
		String sqlUpdate = "update sinhvien set classcode = ?, name = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sqlUpdate);
		ps.setString(1, "T2005E");
		ps.setString(2, "Marry");
		ps.setInt(3, 2);
		
		int res = ps.executeUpdate();
		if (res > 0) {
			System.out.println("Cap nhat thanh cong");
		} else {
			System.out.println("Thao tac khong thanh cong");
		}
		ps.close();
		// lay data tu bang
		String sqlSelect = "select id, name, classcode from sinhvien";
		ps = con.prepareStatement(sqlSelect);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int idtb = rs.getInt(1);
			String nametb = rs.getString(2);
			String classcodetb = rs.getString("classcode");
			System.out.println("id: "+ idtb + "; name: "+ nametb + "; classcode="+ classcodetb);
		}
		
		rs.close();
		ps.close();
		
		con.close();
	}

}
