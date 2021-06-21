package day55_abstraction.exercise_example;

public class Swimming extends Exercise{
    @Override
    public void performExercise() {
        System.out.println("Performing swimming exercise");
    }
    @Override
    public String getCaloriesCount(int minutes){
        return "Burned " + minutes * 20 + " calories in " + minutes + " minutes.";
    }
}
