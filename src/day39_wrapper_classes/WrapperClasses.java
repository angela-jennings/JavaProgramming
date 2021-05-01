package day39_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        int num = 100;
        num = new Integer(num); //reassigning int num from primitive to object

        Integer n = new Integer(666); //declaring a new Integer
        System.out.println("is n 666? " + n.equals(666)); //can use .equals because int is now an object. does not work with primitives otherwise

        System.out.println("is n 000? " + n.equals(000)); //returns boolean value

        Integer intObject = 1000;
        System.out.println(intObject / 50);
        //convert intObject to String
        String intObjectStr = intObject+""; //need to add quotes because Integer is a number. need to concatenate with empty string
        String intObjStr = intObject.toString(); //because it is an object, you can to .toString() to convert to string. can only use those functions with objects
        System.out.println("intObjStr = " + intObjStr);

        /*
            Declare and create primitive object
         */
        Byte b1 = new Byte ((byte) 5);
        Byte b2 = 10;

        Short s1 = new Short((short)40);
        Short s2 = 50;

        Integer i1 = new Integer(100);
        Integer i2 = 200;

        Long l1 = new Long(300L);
        Long l2 = 3455L;

        Float fl1 = new Float (5.2F);
        Float fl2 = 45.3F;

        Double d1 = new Double(345.3);
        Double d2 = 234.5;

        Character ch1 = new Character('A');
        Character ch2 = 'B';

        Boolean bl1 = new Boolean(true);
        Boolean bl2 = false;






    }
}
