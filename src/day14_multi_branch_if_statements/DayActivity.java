package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        //System.out.println("Please type if the day is: sunny, rainy, snowy or windy");
        String weather = ("snowy");

        if(weather.equals("sunny")){
            System.out.println("Go to the park");
        }else if(weather.equals("rainy")){
            System.out.println("stay inside and drink tea");
        }else if(weather.equals("snowy")){
            System.out.println("build a snowman");
        }else if(weather.equals("windy")){
            System.out.println("dont fly a plane");
        }else{
            System.out.println("just code java");
        }

    }

}
