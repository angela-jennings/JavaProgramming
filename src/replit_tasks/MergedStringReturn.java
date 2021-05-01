package replit_tasks;

public class MergedStringReturn {
    public static void main(String[] args) {
        String one = "12345678";
        String two = "abcde";

        System.out.println(mergeStrings(one, two));

    }

    public static String mergeStrings(String one, String two) {
        String merged = "";

        for(int i = 0; i<one.length() || i<two.length(); i++){
            if(i<one.length()){
                merged += one.charAt(i);
            }
            if (i<two.length()){
                merged += two.charAt(i);
            }
        }
        return merged;
    }
}


















