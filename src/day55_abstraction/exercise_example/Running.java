package day55_abstraction.exercise_example;

public class Running extends Exercise {
    @Override
    public void performExercise() {
        System.out.println("Performing running exercise");
    }
    @Override
    public String getCaloriesCount(int minutes){
        return "Burned " + minutes * 10 + " calories in " + minutes + " minutes.";
    }
}
