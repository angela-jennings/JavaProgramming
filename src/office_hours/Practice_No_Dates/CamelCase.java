package office_hours.Practice_No_Dates;

public class CamelCase {
    public static void main(String[] args) {
        /* Given a String of words that follow Camel Case convention. Find and print how many words are in the given String.Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercaseEx:Input:thisHasManyWordsToFindOutput: 6 */

        String str = "thisHasManyWordsToFind";
        int words = 1;
        String temp = "";

        if(str.isEmpty()){
            words = 0;
        }
        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) >= 'A' && str.charAt(i) <+'Z') {
                words++;
                System.out.println(temp);
                temp = "";
            }else{
                temp +=str.charAt(i);
            }
        }
        System.out.println("words: " + words);
    }
}
