package ui;


import javax.swing.*;

public class About_frame extends JFrame {
    JLabel context;

    JLabel label=new JLabel("<html>" +
            "<body>" +
                "<p>A4生日快樂。</p><br>" +
                "<p>努力不要錯過你開台</p><br>" +
                "<p>gmail聯絡我：<br>"+
                "<p>codinghappylife@gmail.com</p>"+
            "<body>" +
            "</html>");
    public  About_frame(){
        this.setTitle("關於我");
        this.add(label);
        this.setSize(250,250);
        this.setVisible(true);

    }
}
