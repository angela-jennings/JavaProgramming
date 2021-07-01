package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {
        /**
         * AbstractA absA = new AbstractA();
         * InterfaceA iA = new InterfaceA();
         *
         * Neither of these work - cannot create an object of Abstract class or Interface
         */
        InterfaceA.staticMethodE("Koga");
    }
}
