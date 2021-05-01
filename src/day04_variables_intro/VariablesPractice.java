package day04_variables_intro;

public class VariablesPractice {
    public static void main(String[] args){
        int students; //value is DECLARED, can declare only once
        students = 50; //value is assigned
        System.out.println(students);

        students = 111; //value is assigned
        students = 125;//value is assigned
        System.out.println(students);

        int assignments;
        assignments = 25;
        System.out.println(students + assignments);

        int teachers;
        teachers = 2;
        System.out.println(teachers);

        int professor = 3;
        System.out.println(professor);

        System.out.println(students + teachers + professor);

        System.out.print("Number of teachers:");
        System.out.println(teachers);
        System.out.print("Number of professors:");
        System.out.println(professor);

        //single variable declaration:
        int apples;
        int grapes;
        int oranges;
        apples = 1;
        grapes = 2;
        oranges =3;

        //multiple variables in 1 statement
        int apple, grape, orange;
        apple = 5;
        grape = 10;
        orange = 15;

        //we can also combine variable declaration and assignment into one statement. it is less lines of code, easier to read. can combine multiple declarations and assignments in one line separating with a comma

        int banana=5, kiwi=10;
        System.out.println(banana+kiwi);

        int dollars=-50, cash=125;
        System.out.println(dollars+cash);
        System.out.println(dollars-cash);
        System.out.println(cash-dollars);






    }
}
