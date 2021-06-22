package day55_abstraction.interfaces_examples;

public interface WebDriver {
    public abstract void get(String url);
    public abstract void close();
    void quit();   //dont need to type public abstract because interfaces are automatically public abstract
    String getTitle();
}
class ChromeDriver implements WebDriver{
    @Override
    public void get(String url){
        System.out.println("Getting " + url + " from Chrome Browser");
    }
    @Override
    public void close(){
        System.out.println("Closing instance of Chrome Browser");
    }
    @Override
    public void quit(){
        System.out.println("Quitting instance of Chrome Browser");
    }
    @Override
    public String getTitle(){
        return "Chrome Browser Title";
    }
}
class FireFoxDriver implements WebDriver {

    @Override
    public void get(String url) {
        System.out.println("Getting " + url + " from Firefox Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing instance of Firefox Browser");
    }

    @Override
    public void quit() {
        System.out.println("Quitting instance of Firefox Browser");
    }

    @Override
    public String getTitle() {
        return "Firefox Browser Title";
    }
}
class OtherMain {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("www.google.com");
        System.out.println(chromeDriver.getTitle());
        chromeDriver.close();
        chromeDriver.quit();

        FireFoxDriver fireFoxDriver = new FireFoxDriver();
        fireFoxDriver.get("www.etsy.com");
        System.out.println(fireFoxDriver.getTitle());
        fireFoxDriver.close();
        fireFoxDriver.quit();
    }
}
