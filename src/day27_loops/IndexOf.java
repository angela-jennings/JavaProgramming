package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'z';
        int index = -1;

        //using for loop: if charAt(i) matches letter, store the i value into index
        //if true, print i is found at index

        for(int i = 0; i<word.length()-1; i++){
            if(word.charAt(i) == letter){
                index = i;
                System.out.println(letter + " is found at index " + index);
            }

        }
        if(index == -1){
            System.out.println("letter not found");
        }
    }
}
