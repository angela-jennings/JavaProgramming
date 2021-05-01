package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
    displayMessage(); //calling the method first time
        displayMessage(); //calling the method the second time
        for(int i = 0; i <3; i++){
            displayMessage();
        }
    }
    //first custom reusable method
    public static void displayMessage() {
        System.out.println("Hello B22 Friends!\nToday we are coding Java\nReplit tasks are hard\n");
    }

}
