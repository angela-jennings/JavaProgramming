package extra_tasks;

public class MoveFirstWord {
    public static void main(String[] args) {
        String message = "Java is a fun language";
        String removeFirstSWord = (message.substring(message.indexOf(" ")+1));
        //String firstWord = message.substring(0, 5);
        //System.out.println(removeFirstSWord + " " + firstWord);

        int space = message.indexOf(" ");
        String firstWord = message.substring(0, space);
        System.out.println(message.substring(space+1));
        System.out.println(message.substring(space +1) + " " + firstWord);
    }
}
/* [Move first word]
Given a sentence. Display the sentence with the first word moved to the end of the sentence.
Ex:
input: Java is a fun language
output: is a fun language Java
Hint: Use indexOf and substring
-----------------------------------------------------------------*/