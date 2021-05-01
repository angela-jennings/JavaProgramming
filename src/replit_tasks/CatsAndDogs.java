package replit_tasks;
import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String catDog = scan.next();
        int catCount = 0;
        int dogCount = 0;
        if(!catDog.contains("cat")){
            System.out.println("false");
        }else if(!catDog.contains("dog")){
            System.out.println("false");
        }else{
        while (catDog.contains("cat")) {
            catDog = catDog.replaceFirst("cat", "");
            catCount++;
            while (catDog.contains("dog")) {
                catDog = catDog.replaceFirst("dog", "");
                dogCount++;
            }
        }
        if(catCount != dogCount){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }

}}}
/* Print true if the string "cat" and "dog" appear the same number of times in the given string word.

Example:
input: catdog output: true
Example:input: catcat output: false
Example:input: cat-cheetah-dog-cat output: false

 int count = 0;
    while(catDog.contains("cat") && catDog.contains("dog")){
    count ++;
        catDog = catDog.replaceFirst("cat", "");
        catDog = catDog.replaceFirst("dog", "");
    }
        if(count%2==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

}}*/