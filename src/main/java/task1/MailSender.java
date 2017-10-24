package task1;

public class MailSender {

    public void sendMail(MailInfo mailInfo) {
        int code = mailInfo.getMailCode();

        if (code == 1) {
            //40 lines of code
            System.out.println("welcome mail was generated and sent to " + mailInfo);
        } else if (code == 2) {
            //45 lines of code
            System.out.println("don't call us we call you. was generated and sent to " + mailInfo);
        }
    }
}
