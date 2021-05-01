package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) throws InterruptedException {
        int count = 10;
        while(count>=0){
            System.out.println("count = " + count);
            count--;
            //Thread.sleep(1000);
            while(count==0){
                System.out.println("Hoooray!");
                count --;
            }
        }
        System.out.println("finished the count");

        int unreadSMS = 10;
        /**read each message until you have 0 unread messages
         */
        while(unreadSMS>=0){
            System.out.println("unreadSMS = " + unreadSMS);
            unreadSMS --;
        }
        System.out.println("finished reading all your dang messages");
    }
}
