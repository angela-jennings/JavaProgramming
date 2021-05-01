package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("Starting ETSY Search Smoke Test");
        openBrowser();
navigateToEtsyUrl();
searchForWoodenSpoon();
verifyResultsAreDisplayed();

    }
    public static void openBrowser(){
        System.out.println("Lauching chrome browser!");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Type etsy.com into your browser");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("enter wooden spoon in search bar");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("make sure wooden spoons are displayed after searching");
    }
}
