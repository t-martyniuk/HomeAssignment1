package task1;

public class Main {
    public static void main(String[] args) {
        MailSender ms = new MailSender();
        ms.sendMail(new MailInfo(new Client("Tetianka", 21), 1));
    }
}
