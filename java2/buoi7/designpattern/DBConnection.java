package buoi7.designpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBConnection {
	private static String url;
	private static String username;
	private static String password;
	static {
		ResourceBundle rs = ResourceBundle.getBundle("buoi7.designpattern.config");
		url = rs.getString("url");
		username = rs.getString("username");
		password = rs.getString("password");
	}
	private static DBConnection dbConnection;
	private DBConnection() {
		
	}
	public static synchronized DBConnection getInstance() {
		if (dbConnection == null) {
			dbConnection = new DBConnection();
		}
		return dbConnection;
	}
	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, username, password);
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
