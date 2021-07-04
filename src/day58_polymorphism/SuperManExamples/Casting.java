package day58_polymorphism.SuperManExamples;

public class Casting {
    public static void main(String[] args) {
        Worker worker = new SuperMan();
        worker.work("QA Manager");
        worker.getPaid();

        ((Father)worker).raiseKid();
        ((SuperMan)worker).playWithKid(); //casting worker to have access to other methods

        //downcasting from worker to superman
        SuperMan superMan = (SuperMan) worker;
        superMan.work("java dev");


    }
}
