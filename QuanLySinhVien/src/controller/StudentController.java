/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Student;
import service.StudentService;
import service.StudentServiceImp;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

/**
 *
 * @author Luong Huy Thong
 */
public class StudentController {

    private JButton btnSubmit;
    private JTextField jtfStudentId;
    private JTextField jtfName;
    private JDateChooser jdcBrithday;
    private JTextField jtfPhone;
    private JRadioButton jtfSexMale;
    private JRadioButton jtfSexFemale;
    private JTextArea jtaAddress;
    private JCheckBox jcbStatus;
    private JLabel jlbMsg;
    private Student student = null;
    private StudentService studentService = null;

    public StudentController(JButton btnSubmit, JTextField jtfStudent, JTextField jtfName, JDateChooser jdcBrithday, JTextField jtfPhone, JRadioButton jtfSexMale, JRadioButton jtfSexFemale, JTextArea jtaAddress, JCheckBox jcbStatus, JLabel jlbMsg) {
        this.btnSubmit = btnSubmit;
        this.jtfStudentId= jtfStudentId;
        this.jtfName = jtfName;
        this.jdcBrithday = jdcBrithday;
        this.jtfPhone = jtfPhone;
        this.jtfSexMale = jtfSexMale;
        this.jtfSexFemale = jtfSexFemale;
        this.jtaAddress = jtaAddress;
        this.jcbStatus = jcbStatus;
        this.jlbMsg = jlbMsg;
        this.studentService = new StudentServiceImp();
    }

    public void setView(Student student) {
        this.student = student;
        // set data
        jtfStudentId.setText("#" + student.getStudentId());
        jtfName.setText(student.getName());
        jdcBrithday.setDate(student.getBrithday());
        if (student.isSex()) {
            jtfSexMale.setSelected(true);
        } else {
            jtfSexFemale.setSelected(true);
        }
        jtfPhone.setText(student.getPhone());
        jtaAddress.setText(student.getAddress());
        jcbStatus.setSelected(student.isStatus());
        // set event
        setEvent();
    }

    public void setEvent() {
        btnSubmit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    if (!checkNotNull()) {
                        jlbMsg.setText("Vui lòng nhập dữ liệu bắt buộc!");
                    } else {
                        student.setName(jtfName.getText().trim());
                        student.setBrithday(covertDateToDateSql(jdcBrithday.getDate()));
                        student.setPhone(jtfPhone.getText());
                        student.setAddress(jtaAddress.getText());
                        student.setSex(jtfSexMale.isSelected());
                        student.setStatus(jcbStatus.isSelected());
                        if (showDialog()) {
                            int lastId = studentService.createrOfUpdate(student);
                            if (lastId != 0) {
                                student.setStudentId(lastId);
                                jtfStudentId.setText("#" + student.getStudentId());
                                jlbMsg.setText("Xử lý cập nhật dữ liệu thành công!");
                            } else {
                                jlbMsg.setText("Có lỗi xảy ra, vui lòng thử lại!");
                            }
                        }
                    }
                } catch (Exception ex) {
                    jlbMsg.setText(ex.toString());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnSubmit.setBackground(new Color(0, 200, 83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSubmit.setBackground(new Color(100, 221, 23));
            }
        });
    }

    private boolean checkNotNull() {
        return jtfName.getText() != null && !jtfName.getText().equalsIgnoreCase("");
    }

    private boolean showDialog() {
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Bạn muốn cập nhật dữ liệu hay không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        return dialogResult == JOptionPane.YES_OPTION;
    }

    public java.sql.Date covertDateToDateSql(Date d) {
        return new java.sql.Date(d.getTime());
    }
}
