package extra_tasks;

public class StopLight {
    public static void main(String[] args) {
        String lightColor = "yellow";

        if(lightColor.equals("green")){
            System.out.println("Go");
        }else if(lightColor.equals("yellow")){
            System.out.println("Slow down");
        }else if(lightColor.equals("red")){
            System.out.println("stop");
        }else{
            System.out.println("Not a valid color");
        }
    }
}
/*[Street light]

        You are at a street line. The color of the street line will determine what you should do.

        Green light - Print "Go"
        Yellow light - Print "Slow down"
        Red light - Print "Stop"*/