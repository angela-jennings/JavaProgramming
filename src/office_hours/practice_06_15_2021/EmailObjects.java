package office_hours.practice_06_15_2021;

public class EmailObjects {
    public static void main(String[] args) {
        Email email = new Email("koga@email.com", 3);
        System.out.println(email.domain);
        System.out.println(email);
        System.out.println();

        Gmail gmail = new Gmail("angela@gmail.com", 5);
        System.out.println(gmail);
        System.out.println(email.domain);
        System.out.println(gmail.domain);
        System.out.println();

        Yahoo yahoo = new Yahoo("athena@yahoo.com", 10);
        System.out.println(yahoo);
        System.out.println(email.domain);
        System.out.println(gmail.domain);
        System.out.println(yahoo.domain);

        gmail.sendEmail();
        yahoo.sendEmail();

    }

}
