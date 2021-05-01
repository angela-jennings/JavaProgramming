package day14_multi_branch_if_statements;

public class IfWithoutElse {
    public static void main(String[] args) {
        int year = 2018;
        if(year==2020){
            System.out.println("Covid19 pandemic year");
            System.out.println("wear mask and keep distance");
        }
        if(year>2020){
            System.out.println("Jokes on you, were still in a pandemic");
        }
        if (year<2020){
            System.out.println("I cant even remember what normal is");
        }

        String country = "USA";
        if(country.equals("USA")){
            System.out.println("Welcome to the United States. It sucks here");
        }
    }
}
