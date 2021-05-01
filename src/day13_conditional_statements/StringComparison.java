package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Loveland";
        if(city.equals("Loveland")){
            System.out.println("That is the correct city");
        }else{
            System.out.println("That is not the correct city!");
        }

        String weather = "sunny";
        if(weather.equals("sunny")){
            System.out.println("go outside and play in the sun");
        }else{
            System.out.println("stay inside and watch Harry Potter");
        }
    }
}
