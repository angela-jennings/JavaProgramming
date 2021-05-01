package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {

        for(int i = 1; i <=10; i++){
            if(i == 6){
                break;
            }
            System.out.println("i = " + i);
        }


        for(int i = 1; i <=10; i++){
            if(i == 3 || i == 6){
                continue;
            }
            System.out.println("i = " + i);
        }

        for(int i = 1; i<=100; i++){
            if(i%2==0){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
