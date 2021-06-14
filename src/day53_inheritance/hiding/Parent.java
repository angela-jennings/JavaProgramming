package day53_inheritance.hiding;

public class Parent {
    public String name = "Angela Jennings";
    public void introduce1(){
        System.out.println("Hello I am " + name);
    }
}

class Child extends Parent {
    public String name = "Koga Jennings";
    public void introduce2(){
        System.out.println("Hello I am " + name);
    }
}

class Runner {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.introduce1();

        Child ch1 = new Child();
        ch1.introduce2();
        ch1.introduce1();
    }
}
