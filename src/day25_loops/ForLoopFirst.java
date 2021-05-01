package day25_loops;
import java.util.*;

public class ForLoopFirst {
        public static void main(String[] args) throws InterruptedException {
                /**
                 * below is infinite loop with for loop like: while(true) { }
                 *  for(;;){
                 *  System.out.println("java is fun!");
                 *  }
                 */


                // in below for loop - everything declared within the () rather than having multiple lines of code
                for(int i = 0; i <= 5; i++){
                        System.out.println("hello world " + i);
                        Thread.sleep(1000);
                }
                for(int i = 0; i<=10; i++){
                        System.out.println("i = " + i);
                        Thread.sleep(1000);
                }


        }
        }
