package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args){
        //int static = 22 -> error, static is a reserved word by java
        int static2 = 22;
        int _static = 22;
        int $tatic = 22;
        int staticvar = 22;

        int salary$ = 55;
        // int 1stMonthSalary = 3000 -> cannot start with a number
        // int $ = 10 -> allowed, but not encouraged, same as int _ = 10
        int salary$$ = 5000;
        int firstMonthlySalary = 5000;

        //int 1stnum =10; -> does not work, cannot start with number
        //int num01 = 10 -> works


    }
}
