package ui;

import javax.swing.*;
import java.awt.*;

public class main_ui {
    JFrame mainFrame=new JFrame();
    JLabel headerLabel;
    JLabel statusLabel;
    JLabel label=null;
    confrim_Button confrim_Button=new confrim_Button();
    contact_Button contact_Button=new contact_Button();
    account_textField account_textField=new account_textField("請輸入gmail帳號");
    password_textField password_textField=new password_textField("請輸入密碼");
    public void dowork(){

        mainFrame=new JFrame("A413512noticer");

        mainFrame.setSize(150,50);
//        mainFrame.setEnabled(false); //凍結視窗

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.setSize(400,400);
        mainFrame.setBounds(500,500,320,160);
        mainFrame.setLayout(new GridLayout(3, 2));
        mainFrame.setResizable(false); //anti-resize

        headerLabel = new JLabel("設定gmail帳號");
        statusLabel = new JLabel("設定gmail密碼");

        confrim_Button.dowork();
        contact_Button.dowork();
        account_textField.dowork();
        password_textField.dowork();

        mainFrame.add(headerLabel);
        mainFrame.add(account_textField);
        mainFrame.add(statusLabel);
        mainFrame.add(password_textField);
        mainFrame.add(confrim_Button);
        mainFrame.add(contact_Button);
        mainFrame.setVisible(true);

    }

}
//