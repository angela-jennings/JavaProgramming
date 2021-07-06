package day59_polymorphism_exception_handling.web_elements_practice;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getLinkHref();
        link.getText();
        link.sendKeys("hello from outer space");

        WebElement loginLink = new Link();
        loginLink.click();
        loginLink.getText();
        loginLink.sendKeys("You can only see what the reference type has. but when you debug, it will take you to Link class");

        WebElement input = new InputField();
        input.sendKeys("creating an object of Input Field");

        WebElementUtil.clickElement(input);
        WebElementUtil.clickElement(loginLink);

        WebElement login = WebElementUtil.getLinkWithText("java");
        login.click();

    }
}
