package replit_tasks;

public class BadWordReturnMethod {
    public static void main(String[] args) {
        String text = "foo bar";
        String badWord = "foo";
        String text2 = "he said blah blah blah";
        String badWord2 = "blah";
        String text3 = "one two three";
        String badWord3 = "two";

        System.out.println(clean(text, badWord));
    }

    public static String clean (String text , String badWord) {
        String newText = "";
        if(text.contains(badWord)){
            newText = text.replace(badWord + " ", "");
        }
        return newText;
    }
}
