package office_hours.practice_06_15_2021;

public class Email {

    final String ADDRESS;
    int numOfEmails;
    static String domain;

    static {
        domain = "generic";
    }
    public Email(String address, int numOfEmails){
        this.ADDRESS = address;
        this.numOfEmails = numOfEmails;
    }

    public static void sendEmail(){
        System.out.println("sending from parent");
    }

    @Override
    public String toString() {
        return "Email{" +
                "Address='" + ADDRESS + '\'' +
                ", numOfEmails=" + numOfEmails +
                ", domain=" + domain +
                '}';
    }
}
