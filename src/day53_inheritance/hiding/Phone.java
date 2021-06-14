package day53_inheritance.hiding;

public class Phone {
    String type = "Rotary Phone";

    public static void use(){
        System.out.print("Using the phone");
    }

    public void call(){
        use();
        System.out.println(" and making a phone call");
    }

}
