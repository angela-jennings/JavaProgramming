package office_hours.practice_06_15_2021;

public class Gmail extends Email {
    static String domain;
    static {
        domain = "gmail";
    }
    public static void sendEmail(){
        System.out.println("sending from gmail");
    }

    public Gmail(String address, int numOfEmails) {
        super(address, numOfEmails);
    }
}
