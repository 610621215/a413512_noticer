package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class contact_Button extends JButton implements ActionListener{

    public contact_Button(){
        this.setText("About");
    }

    public void dowork(){
        super.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("click");
        new About_frame();
    }
}
