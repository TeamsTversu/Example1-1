
package com.mycompany.group5.GUI;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import com.mycompany.group5.List;
import com.mycompany.group5.Queue;
import com.mycompany.group5.Stack;
import java.awt.Insets;


public class Panel extends JPanel {

    JTextField TextBox;
    JButton button;
    JButton addQueueButton;
    JButton addStackButton;
    DefaultListModel listModelMyList;
    DefaultListModel listModelInteger;
    JList<Integer> list;
    JList<List> myList;
    ListModel<Integer> modelInteger;
    ListModel<List> modelMyList;
    Model baseModel;
    
    @SuppressWarnings("unchecked")
    public Panel() {
        TextBox = new JTextField("                    ");
        
        button  = new JButton("Push");
        button.setMargin(new Insets(10,10,10,10));
        
        addQueueButton  = new JButton("Add Queue");
        addQueueButton.setMargin(new Insets(10,10,10,10));
        
        addStackButton  = new JButton("Add Stack");
        addStackButton.setMargin(new Insets(10,10,10,10));
        listModelMyList = new DefaultListModel();
        listModelInteger = new DefaultListModel();
        baseModel = new Model();
        baseModel.setList(new Stack());
        list = new JList<>(baseModel);
        myList = new JList<>(listModelMyList);
        
        myList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        button.addActionListener((ActionEvent e) -> {
            try {
                int k = Integer.parseInt(TextBox.getText().trim());
                baseModel.addElement(k);
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(Panel.this, "Error!");
            }
        });
        
        addQueueButton.addActionListener((ActionEvent e) -> {
            listModelMyList.addElement(new Queue());
        });
        
        addStackButton.addActionListener((ActionEvent e) -> {
            listModelMyList.addElement(new Stack());
        });
        
        add(button);
        add(addStackButton);
        add(addQueueButton);
        add(TextBox);
        add(new JScrollPane(myList));
        add(new JScrollPane(list));
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
    
}
