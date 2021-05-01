package extra_tasks;
import java.util.Scanner;

public class StringMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the message you would like to send");
        String message = scan.nextLine();

        if (message.contains("idiot") || message.contains("dumb") || message.contains("heck")){
            System.out.println("Message cannot be sent using that sort of language");
        }else{
            System.out.println("Okay fine we can send your appropriately worded message");
        }

    }
}
/* Given a String variable with a message. You will check if the message contains any of these bad words: “idiot, dumb, heck”
    -> If the message contains any of those words print: “Message not sent”.
    -> If the message is bad word free print “Message sent”*/