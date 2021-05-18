package day45_OOP;

public class TrafficLightObjects {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight = new TrafficLight();
       //will update value of color using a method of the class
        trafficLight.changeColor("red");
        trafficLight.showColor();
        trafficLight.changeColor("green");
        trafficLight.showColor();
        trafficLight.changeColor("purple");

    }
}
