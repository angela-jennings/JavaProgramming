package extra_tasks;

public class SMSParts {
    public static void main(String[] args) {
String sender = "Sender: <James Bond>. From Number: [202-123-3456].";
String message = "{\"I love programming and problem solving\"}";

String actualSender = sender.substring(sender.indexOf("<")+1, sender.indexOf(">"));
        System.out.println("actualSender = " + actualSender);
String actualNumber = sender.substring(sender.indexOf("[")+1, sender.indexOf("]"));
        System.out.println("actualNumber = " + actualNumber);
String actualMessage = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("actualMessage = " + actualMessage);


    }
}
/* [SMS parts]
Given a String in the following format:
“Sender: <James Bond>. From Number: [202-123-3456]. +
Message: {“I love programming and problem solving}”
Separate these parts and print them separately:
“Sender: actualSender”
“Number: actualNumber”
“Message: actualMessage”*/