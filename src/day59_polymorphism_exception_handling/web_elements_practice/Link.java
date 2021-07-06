package day59_polymorphism_exception_handling.web_elements_practice;

public class Link implements WebElement{
    public static final String TAG_NAME = "@";
    public void getLinkHref(){
        System.out.println("Getting href from link");
    }
    @Override
    public void sendKeys(String text) {
        System.out.println("This is your text: " + text);
    }

    @Override
    public void click() {
        System.out.println("Clicking on your text");
    }

    @Override
    public void getText() {
        System.out.println("Getting your text");
    }
}
