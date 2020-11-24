
package com.mycompany.group5.GUI;

import javax.swing.JFrame;


public class Frame extends JFrame{

    private static final long serialVersionUID = 1L;
    Panel panel;

    Frame(Panel p) { 
        panel = p;
        add(panel);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public Panel getPanel() {
        return panel;
    }

    public void setPanel(Panel panel) {
        this.panel = panel;
    }
}