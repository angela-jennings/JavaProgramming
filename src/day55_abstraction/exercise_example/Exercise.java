package day55_abstraction.exercise_example;

public abstract class Exercise {
    public void start(){
        System.out.println("Warming up. Starting the exercise.");
    }
    public abstract void performExercise(); //abstract method - method without body, just signature. must be overridden by sub class

    public abstract String getCaloriesCount(int minutes);
}
