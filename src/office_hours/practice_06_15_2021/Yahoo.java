package office_hours.practice_06_15_2021;

public class Yahoo extends Email {

    static String domain;
    static {
        domain = "yahoo";
    }
    public static void sendEmail(){
        System.out.println("sending from yahoo");
    }
    public Yahoo(String address, int numOfEmails) {
        super(address, numOfEmails);
    }
}
