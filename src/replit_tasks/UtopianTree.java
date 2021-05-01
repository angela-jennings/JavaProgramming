package replit_tasks;

public class UtopianTree {
    public static void main(String[] args) {
        int yearCount = 0;
        int treeSize = 0;

        for(int i = 0; i<=10; i++){
            if(i<3){
                yearCount ++;
                treeSize = yearCount*1;
                System.out.println("year " + yearCount + " - growth 1 cm\ntree size: " + treeSize + "cm");
            }
            if(i>3){
                yearCount ++;
                treeSize +=2;
                System.out.println("year " + yearCount + " - growth 2 cm\ntree size: " + treeSize + "cm");
            }
            }
        }




    }
