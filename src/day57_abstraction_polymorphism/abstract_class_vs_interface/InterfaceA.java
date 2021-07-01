package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA {
    public static final String TYPE = "interface"; //dont need to write public static final. its automatically public static final because it is an interface
    double MAX_COUNT = 500; //automatically public static final because its an interface

    void absMethodD(int num); //dont need public abstract at beginning because interface are always public and abstract
    static void staticMethodE(String str){ //dont need public access modifier. automatically public because its an interface
        System.out.println("staticMethodE is called with str - " + str);
    }
    default void defaultMethodF(){
        System.out.println("defaultMethodF is called"); //starting from java 8, static and default methods are allowed in interfaces
    }
}
