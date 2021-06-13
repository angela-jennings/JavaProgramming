package day52_inheritance;

public class Discord extends MobileApp{
    public void chat(String topic){
        System.out.println("Talking about " + topic + " on Discord");
    }

    @Override
    public boolean download() {
        System.out.println("App: " + getName() + " version: " + getVersion() + " is downloaded");
        return true;
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        System.out.println("Chatting on discord for " + minutes + " minutes");
    }
}
