package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city1 = "Madison";
        String city2 = "fort collins";

        if(city1.equals("Milwaukee") || city2.equals("Loveland")){
            System.out.println("willing to relocate");
        }else{
            System.out.println("not willing to relocate");
        }

        String teacher = "Murodil";
        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is a java class with " + teacher);
        }else{
            System.out.println("it is not a java class with " + teacher);
        }

        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is a java class with " + teacher);
        }else if(teacher.equals("Nadir")){
            System.out.println("It is a soft skills class with " + teacher);
        }else {
            System.out.println("Some other class with " + teacher);
        }


        //company - google, OR salary >100k

        String company = "Google";
        int salary = 90_000;

        if(company.equals("Google") || salary >100_000){
            System.out.println("I will work at " + company);
        }else{
            System.out.println("Keep looking for a better job");
        }

    }
}
