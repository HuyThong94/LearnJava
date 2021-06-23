/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Category;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.HomePanel;
import view.StudentPanel;

/**
 *
 * @author Luong Huy Thong
 */
public class ScreenSwitchController {

    private JPanel root;
    private String kindSelected = "";
    private List<Category> listItem = null;

    public ScreenSwitchController(JPanel root) {
        this.root = root;
    }

    public void setDashboard(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "Home Page";
        jpnItem.setBackground(new Color(96, 100, 191));
        jlbItem.setBackground(new Color(96, 100, 191));
        JPanel node = new HomePanel();
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(node);
        root.validate();
        root.repaint();
    }

    public void setEvent(List<Category> listItem) {
        this.listItem = listItem;
        for (Category item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    class LabelEvent implements MouseListener {

        private JPanel node;
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "HomePage":
                    node = new HomePanel();
                    break;
                case "Student":
                    node = new StudentPanel();
                    break;
                case "Course":
                    node = new StudentPanel();
                    break;
                case "Classes":
                    node = new StudentPanel();
                    break;
                case "Statistic":
                    node = new StudentPanel();
                    break;
                default:
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(96, 100, 191));
            jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(96, 100, 191));
            jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(76, 175, 80));
                jlbItem.setBackground(new Color(76, 175, 80));
            }
        }

        private void setChangeBackground(String kind) {
            for(Category item : listItem){
                if(item.getKind().equalsIgnoreCase(kind)){
                    item.getJlb().setBackground(new Color(96, 100, 191));
                    item.getJpn().setBackground(new Color(96, 100, 191));
                } else{
                    item.getJlb().setBackground(new Color(76, 175, 80));
                    item.getJpn().setBackground(new Color(76, 175, 80));
                }
            }
        } 
    }
}
