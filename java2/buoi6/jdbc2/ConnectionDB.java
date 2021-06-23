package buoi6.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	// cac thong tin can cho ket noi:
	static String url = "jdbc:sqlserver://localhost:1433;instance=DESKTOP-NDQK039\\SQLEXPRESS2014;databaseName=T2007E_java2";
	static String userName = "sa";
	static String password = "123456";
			// B1: Tao connection
	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connected!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public static void closeConnection(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
