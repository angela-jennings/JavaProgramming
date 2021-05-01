package office_hours.Practice_04_19_2021;

public class MethodClass {
    public static void main(String[] args) {
        /**
         * methods - void and return
         * void - runs code (performs an action). there is no return value. will only run the block of code from the return method --> Arrays.sort() -> takes an array, sorts it, doesnt return anything. only had to call it
         *
         * return - runs a block of code but this returns a value. can return only a single value. ex -> for an array you want to return both min and max number, you would need two different methods. cant combine into one method
         * --> Arrays.binarySearch() -> takes an array and element, tries to find the element, returns the index of the element
         */
    }


    public static void methodOne(){
        System.out.println("one");
    }

    public static String methodTwo(){
        return "two";
    }

    public static int methodThree(String word){
        return word.length();
    }
}
