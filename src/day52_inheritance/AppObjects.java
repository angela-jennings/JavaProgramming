package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("Youtube");
        mobileApp.useTheApp(10);
        System.out.println();

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.useTheApp(20);
        System.out.println();

        Discord discord = new Discord();
        discord.setName("Discord");
        discord.chat("Java");
        discord.useTheApp(15);
        discord.setVersion(1.25);
        discord.download();
    }
}
