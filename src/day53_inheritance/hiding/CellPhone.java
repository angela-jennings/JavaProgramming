package day53_inheritance.hiding;

public class CellPhone extends Phone {
    String type = "Cell Phone";

    //@Override  --> override is error because you cant override a static method - this is method hiding
    public static void use(){
        System.out.print("Using cell phone");
    }

    public void text(){
        use();
        System.out.println(" and sending a text message");
    }
}
