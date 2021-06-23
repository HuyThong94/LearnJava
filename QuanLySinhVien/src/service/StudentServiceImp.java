/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.StudentDao;
import dao.StudentDaoImp;
import java.util.List;
import model.Student;

/**
 *
 * @author Luong Huy Thong
 */
public class StudentServiceImp implements StudentService {
    
    private StudentDao studentDao = null;

    public StudentServiceImp() {
        this.studentDao = new StudentDaoImp();
    }
    
    @Override
    public List<Student> getList() {
        return  studentDao.getList();
    }
    @Override
    public int createrOfUpdate(Student student){
        return studentDao.createrOrUpdate(student);
    }
}
