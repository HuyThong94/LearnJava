package utility;


import javax.swing.table.DefaultTableModel;
import java.util.List;
import model.Student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luong Huy Thong
 */
public class ClassTableModel {
    public DefaultTableModel setTableHocVien(List<Student> listItem, String[] listColumn) {
        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 7 ? Boolean.class : String.class;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        int num = listItem.size();
        Student hocVien = null;
        for (int i = 0; i < num; i++) {
            hocVien = listItem.get(i);
            obj = new Object[columns];
            obj[0] = hocVien.getStudentId();
            obj[1] = (i + 1);
            obj[2] = hocVien.getName();
            obj[3] = hocVien.getBrithday();
            obj[4] = hocVien.isSex()== true ? "Nam" : "Nữ";
            obj[5] = hocVien.getPhone();
            obj[6] = hocVien.getAddress();
            obj[7] = hocVien.isStatus();
            dtm.addRow(obj);
        }
        return dtm;
    }
}
