package day50_inheritance;

public class AudioBook extends Book{
    double timeLengthMinutes;
    String narrator;

    public void listen(){
        System.out.println("You are listening to " + title);
        System.out.println("Book is " + timeLengthMinutes + " minutes");
        System.out.println("Narration by: " + narrator);
    }
}
