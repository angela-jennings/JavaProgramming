package extra_tasks;

public class StringMessageAndNumber {
    public static void main(String[] args) {
        String message = "java class is fun";
        int number = 3;
        System.out.println("message: " + message);
        System.out.println("number: " + number);

        if(number == 1){
            System.out.println(message.replace('a', 'e'));
        }else if(number == 2){
            System.out.println(message.replace('s', 'r'));
        }else if(number == 3){
            System.out.println(message.replace('o', 'z'));
        }

    }
}

/* Given a String message with some text and a number (1-3) replace certain characters from the String message.

When the number is:
        1: replace 'a' with 'e'
        2: replace 's' with 'r'
        3: replace 'o' with 'z'


    Ex:
        message: java class is fun
        number: 1
        Output: jeve cless is fun

    Ex:
        message: java class is fun
        number: 2
        Output: java clarr ir fun*/