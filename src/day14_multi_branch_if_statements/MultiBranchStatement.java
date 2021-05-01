package day14_multi_branch_if_statements;

public class MultiBranchStatement {
    public static void main(String[] args) {
        int day = 6;

        if(day==1){
            System.out.println("It's Monday!");
        } else if(day ==2){
            System.out.println("It's Tuesday!");
        } else if(day == 3){
            System.out.println("It's Wednesday!");
        } else if(day==4){
            System.out.println("It's Thursday!");
        } else if(day==5){
            System.out.println("It's Friday!");
        } else if(day==6){
            System.out.println("It's Saturday!");
        } else if(day==7){
            System.out.println("It's Sunday!");
        } else{
            System.out.println("That is not a day of the week");
        }
    }
}
