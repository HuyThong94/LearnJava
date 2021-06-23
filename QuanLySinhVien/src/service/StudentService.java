/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Student;
import java.util.List;

/**
 *
 * @author Luong Huy Thong
 */
public interface StudentService {
    public List<Student> getList();
    public int createrOfUpdate(Student student);
}
