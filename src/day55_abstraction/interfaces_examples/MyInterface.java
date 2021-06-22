package day55_abstraction.interfaces_examples;

public interface MyInterface {
    public abstract void sayHello();
    public abstract void sayGoodbye();
}
interface MyInterface2 {
    public abstract void koga();
}
class MyClass implements MyInterface, MyInterface2{
    public void sayHello(){
        System.out.println("Hello from MyClass.");
    }
    public void sayGoodbye(){
        System.out.println("Goodbye from MyClass.");
    }
    public void koga(){
        System.out.println("Koga is the cutest dog in the world.");
    }
}
class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.sayHello();
        myClass.sayGoodbye();
        myClass.koga();
    }
}
