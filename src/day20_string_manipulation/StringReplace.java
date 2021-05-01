package day20_string_manipulation;

public class StringReplace {
    public static void main(String[] args) {
        String greeting = "welcome sweet lord and savior satan. earth has been waiting for your return.";
        String newGreeting = greeting.toUpperCase();
        System.out.println(newGreeting);
        System.out.println(newGreeting.replace(".", "666"));

        String sentence = "I love sweet Athena and KogA ";
        System.out.println(sentence.replace("A" , "a"));
        System.out.println(sentence.replace(sentence, "i love athena and koga more than anything else"));
        System.out.println(sentence.replace("sweet ", ""));

    }
}
