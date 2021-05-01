package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("first word is: " + words[0]);
        System.out.println("second word is: " + words[1]);
        System.out.println("third word is: " + words[2]);

        for(String w : words){
            System.out.println(w);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] result = googleResult.split(" ");
        System.out.println("search results = " + result[1]);
        System.out.println("seconds = " + result[3].replace("(", ""));
        System.out.println("seconds = " + result[3].substring(1));






    }
}
