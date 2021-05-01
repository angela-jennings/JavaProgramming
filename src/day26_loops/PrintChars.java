package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
String word = "I love athena and koga";
for(int i = 0; i < word.length(); i++ ){
    System.out.print(word.charAt(i)); //prints the statement forwards

    for(int n = word.length()-1; n >= 0; n-- ){
        System.out.print(word.charAt(n)); //prints the statement backwards
    }
}}}


