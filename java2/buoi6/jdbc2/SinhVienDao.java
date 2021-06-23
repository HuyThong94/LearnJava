package buoi6.jdbc2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

public class SinhVienDao {

	public static void main(String[] args) {
		SinhVienDao svDao = new SinhVienDao();
		//KetQuaDB res = svDao.them1SinhVien(7, "Tom", "T2002E");
		//System.out.println("code: "+ res.getErrCode() + "; errdesc="+ res.getErrDesc());
		KetQuaDB resBatch = svDao.themBatch();
	}
	public KetQuaDB them1SinhVien(int id, String name, String classCode){
		Connection con = ConnectionDB.getConnection();
		Integer errcode = null;
		String errdesc = null;
		if (con != null) {
			CallableStatement cs = null;
			String sql = "exec dbo.pr_themSv ?, ?, ?, ?, ?";
			try {
				cs = con.prepareCall(sql);
				cs.setInt(1, id);
				cs.setString(2, name);
				cs.setString(3, classCode);
				cs.registerOutParameter(4, Types.INTEGER);
				cs.registerOutParameter(5, Types.NVARCHAR);
				cs.executeUpdate();
				errcode = cs.getInt(4);
				errdesc = cs.getString("errordesc");
				//System.out.println("errcode: "+ errcode);
				//System.out.println("errdesc: "+ errdesc);
				
				cs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				errcode = -1;
				errdesc = "Loi trong qua trinh thuc thi";
			}
		}
		ConnectionDB.closeConnection(con);
		return new KetQuaDB(errcode, errdesc);
	}
	public void capNhat1SinhVien() {
		
		/*
		  viet proc -> check id ton tai hay khong, 
		ton tai thi xem ma lop ton tai hay chua? 
		chua thi tao ma lop moi va cap nhat sinh vien
		*/
	}
	public void delete1SinhVien(int id) {
		// sql
	}
	public ArrayList getDsSinhVien() {
		// viet function tra ve dssv;
		return null;
	}
	public void themSinhVienTuFile() {
		// file -> dung batch de them nhieu ban ghi
	}
	public KetQuaDB themBatch() {
		KetQuaDB result = null;
		Connection con = ConnectionDB.getConnection();
		if (con != null) {
			try {
				// thay doi mac dinh commit -> false: de thuc hien duoc tat ca cac lenh sql 1 lan
				con.setAutoCommit(false);
				String sql = "insert into sinhvien (id, name, classcode) values (?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				// them cac hang vao batch (batch la tap chua nhieu hang ban ghi)
				for (int i=10; i<= 49; i++) {
					// su dung ham set -> them gia tri tung cot tai moi hang
					ps.setInt(1, i);
					ps.setString(2, "Sv"+i);
					ps.setString(3, "T2007E");
					// su dung ham addBatch de them 1 hang vao batch
					ps.addBatch();
				}
				// thuc thi cac lenh trong batch
				int[] res = ps.executeBatch();
				// cap nhat data tu batch vao table
				con.commit();
				ps.close();
				System.out.println("execute batch thanh cong!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		ConnectionDB.closeConnection(con);
		return result;
	}
}
