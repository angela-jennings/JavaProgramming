package office_hours;

public class LongestPalindrome {
    public static void main(String[] args) {
        String[] words = {"java", "longer word", "civic", "apple", "mom", "racecar", "anna"};
        String longestPalindrome = "";

        for(String word : words){
            boolean isPalindrome = true;
            //boolean needs to be in the loop because after each word you want the value to be reset

            for(int i=0; i < word.length()/2; i++) {

                if(word.charAt(i) != word.charAt(word.length()-1-i)) {
                    isPalindrome = false;
                    break;
                }
            }
         if(isPalindrome && word.length() > longestPalindrome.length()){
             longestPalindrome = word;
         }
        }
        System.out.println(longestPalindrome.isEmpty() ? "No palindrome" : longestPalindrome);
    }
}
