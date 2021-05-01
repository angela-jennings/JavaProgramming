package day05_primitives_concentration;

public class UsingVariables {
    public static void main(String[] args){
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1); //prints 100
        System.out.println(num2); //prints 100 - num2 is defined as num1, so num2 will display value of num1

        num1 = 200; //changing value of num1
        System.out.println(num1); //will now print 200
        System.out.println(num2); //haven't redefined value of num2, still prints 100
        num2=num1; //num2 is redefined
        System.out.println(num1); //now both print as 200 because num2 has been redefined
        System.out.println(num2);

        int n1 = 666;
        int n2 = n1; //n2 defined as value of n1 which is 666
        int n3 = n2; //n3 is defined as n2 - n2 is defined as n1 which is 666

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n1+n2+n3);

        int lovelandZipCode = 80537;
        int angelasZipCode = lovelandZipCode;
        int mattsZipCode = lovelandZipCode;
        System.out.println(angelasZipCode);
        System.out.println(mattsZipCode);
        angelasZipCode = 80525;
        System.out.println(angelasZipCode);
        mattsZipCode = 80525;
        System.out.println(angelasZipCode);
        System.out.println(mattsZipCode);

    }
}
