package day59_polymorphism_exception_handling.web_elements_practice;

public class WebElementUtil {
    public static void clickElement(WebElement element){
        System.out.println("Clicking on Element");
        element.click();
    }
    public static WebElement getLinkWithText(String txt){
        System.out.println("Searching for a link with text = " + txt);
        return new Link();
    }
}
