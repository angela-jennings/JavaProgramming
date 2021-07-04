package office_hours.practice_06_28_2021;

public abstract class SocialMedia {

    String personUrl;
    int accountLength;
    static String platform;

    public abstract void directMessage(String username, String message);
    public abstract void post(String body);
    public abstract void notifications();

}
