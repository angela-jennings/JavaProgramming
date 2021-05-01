package replit_tasks;
import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        boolean isValid = false;
        String result = "";
        if(str.contains("bread")){
            int firstBread = str.indexOf("bread");

            if(str.substring(firstBread+5).contains("bread")) {
                //int lastBread = str.substring(firstBread+5).indexOf("bread");
                int lastBread = str.lastIndexOf("bread");
                result = (str.substring(firstBread + 5, lastBread));
                System.out.println(result);

                if(result.isEmpty()){
                    System.out.println("nothing");
                }
            }else {
                System.out.println("nothing");
            }

        }



        }


    }

    /* if (!str.substring(0,5).contains("bread")) {
            System.out.println("nothing");
        }else if (!str.substring(str.length() - 5).contains("bread")) {
                System.out.println("nothing");
            } else if (str.substring(0).contains("bread") && (str.substring(str.length() - 5).contains("bread"))) {
            System.out.println(str.replace("bread", ""));
            }*/