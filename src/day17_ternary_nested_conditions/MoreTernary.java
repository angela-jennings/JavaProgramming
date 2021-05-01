package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {

        int hourlyRate = 50;

        String reply = (hourlyRate>45) ? "accept" : "reject";
        System.out.println("reply = " + reply);

        String todaysClass = "Java";

        String teacher = (todaysClass.equals("Java")) ? "Saim/Murodil" : "Nadir";
        System.out.println("teacher = " + teacher);

        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive) ? "Has Drivers License and can drive" : "No drivers license and cannot drive";
        System.out.println("driving = " + driving);
    }
}
