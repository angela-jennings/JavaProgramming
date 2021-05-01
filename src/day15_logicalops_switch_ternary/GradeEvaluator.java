package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'a';
        if(grade == 'A' || grade == 'a' || grade == 'B' || grade == 'b' || grade == 'C' || grade == 'c' ){
            System.out.println("Grade: " + grade + " is a passing grade");
        }else if(grade == 'D') {
            System.out.println("Grade: " + grade + " qualifies for a re-take");
        }else if(grade == 'E'){
            System.out.println("Fail. " + grade + " is not a passing grade");
        }else{
            System.out.println(grade + " is not a valid grade");
        }




    }
}
