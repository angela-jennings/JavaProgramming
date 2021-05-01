package extra_tasks;
import java.util.Scanner;

public class CybertekBatchInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter either US batch or EU batch");
        String  batchType = scan.next();

        if(batchType.equalsIgnoreCase("US")){
            System.out.println("Please enter either AM or PM for class type");
            String amOrPmClass = scan.next();
            if(amOrPmClass.equalsIgnoreCase("AM")){
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
            }else{
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
            }
        }
        if(batchType.equalsIgnoreCase("EU")){
            System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");

        }
    }
}

    /*In Cybertek we have three batch types: US morning, US evening, EU.
Depending on a batch type (String) print information about the batch.

First figure out is is a US batch or EU batch

    - for US batches:

        > Figure out is it a morning batch or evening batch
            > morning - print: Class times are 10-5 EST. M, T, Th, F.
            > evening - print: Class times are 7-10 EST. M, T, W, Th, S, S

    - for EU batches:

        > print: Class times are  10-5 EST. M, T, W, Th, F.

*/

