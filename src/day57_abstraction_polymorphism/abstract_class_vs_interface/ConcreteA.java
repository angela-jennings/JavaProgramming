package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB {
    /**
     * concrete class - first non-abstract child of abstract class or interface. Can extend only one abstract class. can implement multiple interfaces
     */
    @Override
    public void absMethodA() {
        System.out.println("absMethodA implementation is called");
    }

    @Override
    public void methodB() {
        super.methodB();
        System.out.println("methodB overridden version is called");
    }
    public static void staticMethodC(){
        System.out.println("static methodC hidden version is called");
    }

    @Override
    public void absMethodD(int num) {
        System.out.println(num + " this number comes from InterfaceA. It is the overridden version");
    }
}

