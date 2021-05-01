package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char alphabetLetter = 'a';
        System.out.print(alphabetLetter + " ");
        while(alphabetLetter < 'z'){
            alphabetLetter ++;
            System.out.print(alphabetLetter + " ");
        }
        System.out.println("Thats the end of the alphabet!");

        char letter = 'z';
        System.out.print("\n"+letter + " ");
        while(letter > 'a'){
            letter --;
            System.out.print(letter + " ");
        }
        System.out.println("Thats the alphabet in reverse!");
    }
}
