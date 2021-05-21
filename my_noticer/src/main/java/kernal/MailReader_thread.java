package kernal;

public class MailReader_thread implements Runnable{

    public static String username="";
    public static String password="";

    public  static String host = "imap.gmail.com";
    public static  String mailStoreType = "imap";
    @Override
    public void run() {

        MailReader.check(host, mailStoreType, username, password);
    }

}
