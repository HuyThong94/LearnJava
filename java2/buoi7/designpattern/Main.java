package buoi7.designpattern;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		DBConnection db1 = DBConnection.getInstance();
		DBConnection db2 = DBConnection.getInstance();
		System.out.println(db1);
		System.out.println(db2);
		*/
		Connection con1 = DBConnection.getInstance().getConnection();
		System.out.println("Connected!");
		DBConnection.closeConnection(con1);
	}

}
