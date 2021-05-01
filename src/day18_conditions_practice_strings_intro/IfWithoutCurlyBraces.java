package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "python";

        if(todaysClass.equals("java"))          //this works without curly braces because there is only one conditional statement
            System.out.println("java is fun");
        else
            System.out.println("it is not java. it is " + todaysClass);

        int score = 2;           //this works because we have 1 statement
        if(score == 1)
            System.out.println("lowest score is 1");
        else if(score == 2)
            System.out.println("score is 2");
        else if (score == 3)
            System.out.println("score is 3");
        else
            System.out.println("invalid score");


        if(score>0){
            System.out.println("pass");           // this example needs curly braces because more than 1 statement prints
            System.out.println("your score is " + score);
        }else{
            System.out.println("fail");
            System.out.println("your score is " + score);
        }

    }
}
