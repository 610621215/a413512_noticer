package ui;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class account_textField  extends JTextField implements FocusListener {
    static String result="";
    String hint;
    public account_textField(String hint) {
        this.hint=hint;
        this.setText(hint);
        this.setColumns(15);

    }

    public void dowork(){
        super.addFocusListener(this);
    }
    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("show gained");
        result=this.getText();
        if(super.getText().equals(hint)||super.getText().equals("")) {
            super.setText("");
        }

    }

    @Override
    public void focusLost(FocusEvent e) {
        System.out.println("show lost");
        result=this.getText();
        if(super.getText().equals(hint)||super.getText().equals("")) {
            super.setText(hint);

        }
    }

    @Override
    public String getText() {
        return super.getText();
    }

}
