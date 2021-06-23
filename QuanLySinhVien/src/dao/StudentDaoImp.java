/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Student;

/**
 *
 * @author Luong Huy Thong
 */
public class StudentDaoImp implements StudentDao {

    @Override
    public List<Student> getList() {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM db_student";
        List<Student> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setStudentId(rs.getInt("studentId"));
                student.setName(rs.getString("name"));
                student.setPhone(rs.getString("phone"));
                student.setAddress(rs.getString("address"));
                student.setBrithday(rs.getDate("brithday"));
                student.setSex(rs.getBoolean("sex"));
                student.setStatus(rs.getBoolean("status"));
                list.add(student);
            }
            ps.close();
            cons.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int createrOrUpdate(Student student) {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "INSERT INTO hoc_vien(ma_hoc_vien, ho_ten, ngay_sinh, gioi_tinh, so_dien_thoai, dia_chi, tinh_trang) VALUES(?, ?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE ho_ten = VALUES(ho_ten), ngay_sinh = VALUES(ngay_sinh), gioi_tinh = VALUES(gioi_tinh), so_dien_thoai = VALUES(so_dien_thoai), dia_chi = VALUES(dia_chi), tinh_trang = VALUES(tinh_trang);";
            PreparedStatement ps = cons.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, student.getStudentId());
            ps.setString(2, student.getName());
            ps.setDate(3, new Date(student.getBrithday().getTime()));
            ps.setBoolean(4, student.isSex());
            ps.setString(5, student.getPhone());
            ps.setString(6, student.getAddress());
            ps.setBoolean(7, student.isStatus());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
            ps.close();
            cons.close();
            return generatedKey;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImp();
        System.out.println(studentDao.getList());
    }
}
