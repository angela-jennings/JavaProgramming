package day27_loops;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Neighbors {
    public static void main(String[] args) {
        String word = "jaavvaaloopyyloopdaloop";
        for(int index = 0; index < word.length()-1; index++){
            System.out.print(word.charAt(index));
            System.out.println(word.charAt(index+1));
            if(word.charAt(index) == word.charAt(index+1)){
                System.out.println("beep beep ya loser");
            }
        }

    }

}


