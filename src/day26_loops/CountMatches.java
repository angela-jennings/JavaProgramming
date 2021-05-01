package day26_loops;

public class CountMatches {
    public static void main(String[] args) {
        String word = "athena and koga are the best dogs ever";
        char letter = 'a';
        int count = 0;
        //for below code: variable i is basically taking the place of letter. i++ allows for the loop. if char at i equals the variable letter, then adds 1 to count for every instance of letter
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == letter){
                count ++;
            }
        }
        System.out.println("count = " + count);
    }
}
