package day57_abstraction_polymorphism.abstract_class_vs_interface;

import java.io.Serializable;

public interface InterfaceB extends InterfaceA, Serializable, Cloneable {
    //interface can extend multiple interfaces. Interfaces do not implement other interfaces. MULTI INHERITANCE
    //when it extends another interface, child interface is not responsible to override any methods. Concrete sub class will be responsible for overriding all abstract methods
}
