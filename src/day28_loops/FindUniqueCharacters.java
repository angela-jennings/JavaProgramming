package day28_loops;
/**
 * given a string, retrieve and print only unique characters
 */
public class FindUniqueCharacters {
    public static void main(String[] args) {
        String word = "ateener and kogurt";
        String unique = "";
        for(int i = 0; i <word.length();  i++){
            //System.out.println(word.charAt(i));
            if(!unique.contains(word.charAt(i) + "")){
                unique += word.charAt(i); //if unique does not contain part of word that is stored in i, then store i into the string unique
                //System.out.println(unique); // when you print in the loop it creates a triangle
            }
        }
        System.out.println(unique);
    }
}
