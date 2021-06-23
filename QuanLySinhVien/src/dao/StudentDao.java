/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Student;

/**
 *
 * @author Luong Huy Thong
 */
public interface StudentDao {
    public List<Student> getList();
    public int createrOrUpdate(Student student);
}
