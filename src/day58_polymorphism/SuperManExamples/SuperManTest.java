package day58_polymorphism.SuperManExamples;

public class SuperManTest {
    public static void main(String[] args) {
        Worker sdet = new SuperMan();
        Father dad = new SuperMan();
        SuperMan superman = new SuperMan();

        dad.feedKid();
        dad.playWithKid();
        dad.raiseKid();

        sdet.getPaid();
        sdet.work("sdet");

        superman.getPaid();
        superman.playWithKid();
        superman.feedKid();  //superman has access to all methods/variables in father class and worker interface
    }
}
