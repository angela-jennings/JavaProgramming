package replit_tasks;
import java.util.*;

public class InnerOuter {
    public static void main(String[] args) {
        int[] outer = {1, 4, 3, 2};
        int[] inner = {2, 3};

        Arrays.sort(inner);
        Arrays.sort(outer);
        int count = 0;

        for (int in = 0; in < inner.length; in++){
            for (int out = 0; out <outer.length; out++){
                if(inner[in] == outer[out]){
                    count ++;
                }
            }
        }
        if(count >0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }



            }
        }
