package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "cat,car,blackcat,redcar";
        //using substring print first three letters

        for(int i = 0; i < list.length()-2; i++){
            System.out.println(list.substring(i, i+3));
            //if (list.substring(i, i+3)) equals "cat" or "car" print "cat found" or "car found"
            if(list.substring(i, i+3).equals("cat") || list.substring(i, i+3).equals("cat")){
                System.out.println("cat or car found");
            }
        }
        /*
        int i = 0;
        System.out.println(list.substring(0, 3));//prints 3 letters at a time starting at index 0
        System.out.println(list.substring(1, 4));//prints next 3 letters starting at index 1
        System.out.println(list.substring(2, 5));//prints next 3 letters starting at index 2

        System.out.println(list.substring(i, i+3)); //declaring a new variable of i to replace the index number
        i++;                                        //can replace all of this with loop
        System.out.println(list.substring(i, i+3));
        i++;
        System.out.println(list.substring(i, i++));*/


    }}

