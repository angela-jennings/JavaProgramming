package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator.add(10, 25); //static method - calling class name then method name. dont need to print because the class has a print statement, not a return statement

        Calculator math = new Calculator();
        math.multiply(5,5); //need to create and object so that you can use the calculator class. then once object is created, you can refer back to the object and call the class you want to use. also dont need to call print because it is a void method which has to "return"/ - returns nothing
        //the class multiply is an instance method so we need to create an object to use it

        math.add(10,50); //can also use the object to call static methods

    }
}
