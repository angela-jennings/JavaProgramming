package day29_nestedloop_arrays;

public class CountCharsNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        int count = 0;

        for(int outer = 0; outer<word.length(); outer++){
            char outerLetter = word.charAt(outer);
            count = 0; //reset cou
            for(int inner = 0; inner<word.length(); inner++){
                char innerLetter = word.charAt(inner);
                    if(word.charAt(outer) == word.charAt(inner)){
                        count ++;
                }
            }
            System.out.println(word.charAt(outer) + "=" + count);
        }






        /**
         * outer = 0 to length
         *     -> char outerLetter = word.charAt(outer)
         *     -> int count = 0;
         *  inner = 0 to length
         *      -> char innerLetter = word.charAt(inner)
         *
         * if outerChar == innerChar && outer != inner
         * -> if true count ++;
         *
         * print outerChar + ":" + count
         * __________________________________
         * output:
         * j = 1
         * a = 2
         * v = 1
         * a = 2
         *
         */

    }
}
