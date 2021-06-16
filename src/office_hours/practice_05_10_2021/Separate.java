package office_hours.practice_05_10_2021;

import java.util.ArrayList;

public class Separate {
    /*[Separate parts]
    Write a program that can extract the special characters, digits and letters from a string and stores them into   separate ArrayLists of Characters
    Ex: str = "ABCD123$%#@&456EFG!"
    list1: {$, %, #, @, &, !}
    list2: {A, B, C, D, E, F, G}
    list3: {1, 2, 3, 4, 5, 6}
    Challenge: make a method that will do this action and it will return an ArrayList which holds all 3 of the other ArrayLists
    Challenge 2: do the original task again, but without a loop. Use lambda
    */

    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();

        for(int i = 0; i<str.length(); i++){
            char eachChar = str.charAt(i);
            if(Character.isLetter(eachChar)){
                letters.add(eachChar);
            }else if(Character.isDigit(eachChar)){
                digits.add(eachChar);
            }else{
                special.add(eachChar);
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(special);


        System.out.println(separateParts(str));



        //separate parts using lambda
        ArrayList<Character> all = new ArrayList<>();

        for(int i = 0; i < str.length(); i++){
            all.add(str.charAt(i));
        }

        ArrayList<Character> letters1 = new ArrayList<>(all);
        ArrayList<Character> digits1 = new ArrayList<>(all);
        ArrayList<Character> special1 = new ArrayList<>(all);

        letters1.removeIf(eachChar -> !Character.isLetter(eachChar));
        digits1.removeIf(eachChar -> !Character.isDigit(eachChar));
        special1.removeIf(eachChar -> Character.isLetter(eachChar) || Character.isDigit(eachChar));

        System.out.println("letters1 = " + letters1);
        System.out.println("digits1 = " + digits1);
        System.out.println("special1 = " + special1);






    }
    public static ArrayList<ArrayList<Character>> separateParts(String str){
        ArrayList<ArrayList<Character>> all = new ArrayList();

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();

        all.add(letters);
        all.add(digits);
        all.add(special);

        for(int i = 0; i<str.length(); i++){
            char eachChar = str.charAt(i);

            if(Character.isLetter(eachChar)){
                all.get(0).add(eachChar);
            }else if(Character.isDigit(eachChar)){
                all.get(1).add(eachChar);
            }else{
                all.get(2).add(eachChar);
            }
        }
        return all;
    }


}
