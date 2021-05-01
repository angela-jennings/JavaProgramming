package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] newSentence = sentence.split(" ");
        String reversed = "";
        //print array in reverse order
        for(int i = newSentence.length-1; i>=0; i--){
            reversed += newSentence[i] + " ";
        }
        System.out.println("sentence reversed = " + reversed);
        System.out.println("sentence forward = " + sentence);
    }
}
