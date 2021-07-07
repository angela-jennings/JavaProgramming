package day60_exception_handling;

public class MultiCatchBlock {
    public static void main(String[] args) {
       // String word = "koga";
        String word = null;
        try {
            System.out.println("word = " + word);
            System.out.println("length = " + word.length());
            System.out.println(word.substring(20));
        } catch (NullPointerException e) {
            System.out.println("null pointer exception caught and handled");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index number wrong, check if you entered valid index");
        }
    }
}
