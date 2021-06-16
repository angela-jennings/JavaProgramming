package day54_abstraction;

public  abstract class MyAbstractClass {
    int num = 55;
    public void learn() {
        System.out.println("Learning...");
    }
    public abstract void close();

}
class Sub extends MyAbstractClass {
    @Override
    public void close() {
        System.out.println(num + 5); //must override abstract method in child class. dont need abstract keyword
    }
}

class MyObjects {
    public static void main(String[] args) {
        //MyAbstractClass mac =  new MyAbstractClass(); --> cannot create object from abstract class. must create from child class
        Sub sub = new Sub();
        sub.learn();
        System.out.println(sub.num);
        sub.close();
    }
}
