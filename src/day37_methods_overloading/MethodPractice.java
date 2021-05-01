package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("java", 3, '|'));
        System.out.println(repeatString("Hail Satan", 6, '*'));

    }

    public static String repeatString(String word, int times, char delimiter) {
        String newWord = "";
        for (int i = 0; i < times; i++) {
            newWord += word + delimiter;

//            if(i == times){
//                newWord += word;
//            }else {
//                newWord += word + delimiter;
//            } <--- this if statement adds only the word to the string when it gets to the last loop

        }
        newWord = newWord.substring(0, newWord.length()-1);
        return newWord;
    }
}

