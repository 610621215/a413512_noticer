package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import kernal.*;
public class confrim_Button extends JButton implements ActionListener{
    public static boolean isclick=false;

    public confrim_Button(){
        this.setText("確認");
    }

    public void dowork(){
      super.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(" confirm click");
        isclick=true;
        String host = "imap.gmail.com";
        String mailStoreType = "imap";

        System.out.println(account_textField.result);
        System.out.println(password_textField.result);
//        username= account_textField.result;
//        password= password_textField.result;
        MailReader_thread.username= account_textField.result;
        MailReader_thread.password= password_textField.result;
        Thread t1=new Thread(new MailReader_thread());
        t1.start();

    }
}
