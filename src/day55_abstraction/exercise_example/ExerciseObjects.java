package day55_abstraction.exercise_example;

public class ExerciseObjects {
    public static void main(String[] args) {
        Running run = new Running();
        //Lifting lift = new Lifting();
        //lift.start();
        //lift.performExercise();
        //System.out.println(lift.getCaloriesCount(20));
        //System.out.println();
        /**
         * in the above, since lifting is also abstract, you cannot make an object from it. you need to make an object of its sub class
         */
        SubLifting babyLift = new SubLifting();
        Swimming swim = new Swimming();
        JavaProgramming jp = new JavaProgramming();

        run.start();
        run.performExercise();
        System.out.println(run.getCaloriesCount(30));
        System.out.println();

        babyLift.start();
        babyLift.performExercise();
        System.out.println(babyLift.getCaloriesCount(25));
        System.out.println();

        swim.start();
        swim.performExercise();
        System.out.println(swim.getCaloriesCount(45));
        System.out.println();

        jp.start();
        jp.performExercise();
        System.out.println(jp.getCaloriesCount(60));
        System.out.println();
    }
}
