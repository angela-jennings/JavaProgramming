package day55_abstraction.exercise_example;

public abstract class Lifting extends Exercise{
//    @Override
//    public void performExercise() {
//        System.out.println("Performing lifting exercise");
//    }
//    @Override
//    public String getCaloriesCount(int minutes){
//        return "Burned " + minutes * 15 + " calories in " + minutes + " minutes.";
//    }
}

/**
 * in the above example, lifting is also abstract. that means that it needs a child class to override the methods and lifting doesnt need to override any.
 */
class SubLifting extends Lifting{
    @Override
    public void performExercise(){
        System.out.println("Performing lifting exercise in child class of lifting.");
    }
    @Override
    public String getCaloriesCount(int minutes){
        return "Burned " + minutes * 15 + " calories in " + minutes + " minutes. This is coming from sub class of already extended lifting class.";
    }

        }
