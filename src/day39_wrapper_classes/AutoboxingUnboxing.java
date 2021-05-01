package day39_wrapper_classes;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        int n = 100;
        Integer n1 = n;   //example of autoboxing -> turned primitive into wrapper class object


        Integer n2 = new Integer (500);
        // can also write as Integer n2 = 500;
        int n3 = n2;   //example of unboxing -> turned wrapper class object into primitive

        double d3 = new Double(345.3); // unboxing --> declaring a primitive as a wrapper class but d3 is still primitive



    }
}
