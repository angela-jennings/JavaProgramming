package office_hours.practice_no_dates;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println(reverseNoSpec(scan.next()));
        System.out.println(reverseNoSpec("Ab,c,de!$"));
        //want to ignore all special characters


    }
    public static String reverseNoSpec(String str){
        char [] letters = str.toCharArray();
       for(int i = 0, j=letters.length-1; i <=letters.length/2; i++){
           if(Character.isLetter(letters[i])){
               for( ; j>=0 ; j--){
                   if(Character.isLetter(letters[j])){
                       char temp = letters[i]; //A
                       letters[i] = letters[j]; //e
                       letters[j--] = temp; //A post decrementing j so it doesnt stay looping the already swapped letter
                       break;
                   }
               }
           }
       }
       return String.valueOf(letters);
    }
}
