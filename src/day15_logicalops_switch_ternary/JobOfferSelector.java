package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args){
        String preferredLocation = "Boulder";
        int salary = 125_000;
        boolean isRemote = true;
        boolean hasBenefits = true;

        if(hasBenefits && isRemote && preferredLocation.equals("Boulder") && salary>=125_000){
            System.out.println("This job sounds great, accept the job");
        }else{
            System.out.println("Dont take this peasant job");
        }
    }
}
