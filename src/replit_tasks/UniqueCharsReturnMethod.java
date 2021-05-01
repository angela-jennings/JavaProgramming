package replit_tasks;

public class UniqueCharsReturnMethod {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(uniqueChars(word));

    }

    public static String uniqueChars(String str) {

        String[] newStr = str.split("");
        String newWord = newStr[0];
        String checked = "";


        for (int i = 0; i < newStr.length; i++) {
            for (int j = 0; j < newStr.length; j++) {
                if (newStr[i].equals(newStr[j])) {
                    newWord += newStr[i];
                    break;
                }
            }

        }
        return newWord;
    }
}

