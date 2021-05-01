package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
String message = "Sender: [ Nadir ] From Number <(222)-333-4444> Message: {Hello, lets code some java}";
        /**using substring and indexOf together
         * indexOf() will find index numbers of the special characters: [], <>, {}
         * when message.indexOf([) --> gives index number for that character
         * when message.indexOf(]) --> gives index number for that character
         */
        int start = (message.indexOf("["));
        int end = (message.indexOf("]"));
        System.out.println(message.substring(start+1, end));
        String sender = (message.substring(start+1, end));
        System.out.println("sender = " + sender);

        String mobileNumber = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        System.out.println("mobileNumber = " + mobileNumber);

        String textMessage = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("textMessage = " + textMessage);

        sender = sender.trim(); //trim removes spaces or tabs before and after text. space will result in false condition otherwise. without trim it would return "message from someone else"
        if(sender.equals("Nadir")){
            System.out.println("message from nadir about softskills");
        }else{
            System.out.println("message from someone else");
        }


    }
}
