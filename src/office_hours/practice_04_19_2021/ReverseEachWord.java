package office_hours.practice_04_19_2021;
import day38_methods.StringUtils;

public class ReverseEachWord {
    public static void main(String[] args) {

        System.out.println(reverseEachWord("Hello my name is Angela"));

    }

    public static String reverseEachWord(String str){
       String reverse = "";
       for(String each : str.split(" ")){
           reverse += StringUtils.isReverse(each) + " ";
       }
       return reverse.trim();
    }
}
