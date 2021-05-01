package day05_primitives_concentration;

public class PrimitivesExample {
    public static void main(String[] args){
        //WHOLE NUMBERS, OR, INTEGER TYPES
        byte byteValue = 5;
        short shortValue =10;
        int intValue = 20;
        long longValue = 123456456789235L;
        //DECIMAL NUMBERS, OR, FLOATING POINT TYPES
        float floatValue = 1.245678916546546843843456F;
        double doubleValue = 123456.123456789; //D at end also valid, but optional
        System.out.println((byteValue*byteValue)+(shortValue*shortValue));
        System.out.println(byteValue*byteValue-shortValue*shortValue);
        char charValue = 'a'; //CAN BE UPPER OR LOWERCASE, AS LONG AS ITS 1 CHARACTER
        //BOOLEAN CAN BE TRUE OR FALSE ONLY
        boolean booleanValue = true;

        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(booleanValue);






    }
}
