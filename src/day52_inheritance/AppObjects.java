package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.name = "Youtube";
        mobileApp.useTheApp(10);
        System.out.println();

        Instagram instagram = new Instagram();
        instagram.name = "Instagram";
        instagram.useTheApp(20);
        System.out.println();

        Discord discord = new Discord();
        discord.name = "Discord";
        discord.chat("Java");
        discord.useTheApp(15);
    }
}
