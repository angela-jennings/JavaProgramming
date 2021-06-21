package day55_abstraction.exercise_example;

public class JavaProgramming extends Exercise{ @Override
public void performExercise() {
    System.out.println("Performing java programming exercise");
}
    @Override
    public String getCaloriesCount(int minutes){
        return "Burned no calories in " + minutes + " minutes because programming requires sitting at a desk all day.";
    }
}
