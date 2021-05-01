package day40b_review_class;

public class CountLetters {
    public static void main(String[] args) {
        countLetters("apple tree");
    }

    public static void countLetters(String str) {
        str = str.replace(" ", "");
        String checked = "";
        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            int count = 0;
            if (!checked.contains("" + eachLetter)) {

                for (int j = 0; j < str.length(); j++) {
                    char eachOtherLetter = str.charAt(j);
                    if (eachLetter == eachOtherLetter) {
                        count++;
                    }
                }
                System.out.print(count + "" + eachLetter + " ");
                checked += eachLetter;
            }

        }
    }
}
