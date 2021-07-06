package day59_polymorphism_exception_handling.web_elements_practice;

public class InputField implements WebElement{
    public void getValue(){
        System.out.println("Returning your value");
    }
    @Override
    public void sendKeys(String text) {
        System.out.println("This is your text from Input Field " + text);
    }

    @Override
    public void click() {
        System.out.println("Clicking on something from Input Field");
    }

    @Override
    public void getText() {
        System.out.println("Getting the text of something from Input Field");
    }
}
