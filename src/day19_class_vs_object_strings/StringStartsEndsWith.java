package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String phrase = "Mark of the beast 666";
        System.out.println(phrase.startsWith("Mark")); // true
        System.out.println(phrase.endsWith("666")); // true

        if(phrase.startsWith("Mark")){
            System.out.println("Hail Satan");
            if(phrase.endsWith("666"));
            System.out.println("Hail Lucifer");
        }else {
            System.out.println("Satan loves you");
        }

            String website = "https://www.stackoverflow.com";

            if(website.endsWith(".com")){
                System.out.println("commercial website");
            }else if(website.endsWith(".ru")){
                System.out.println("russian website");
            }else if(website.endsWith(".gov")){
                System.out.println("government website");
            }else if(website.endsWith(".edu")){
                System.out.println("educational website");
            }else{
                System.out.println("not a valid web address");
            }
        }
    }

