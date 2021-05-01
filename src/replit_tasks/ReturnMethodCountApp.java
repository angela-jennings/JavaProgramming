package replit_tasks;

public class ReturnMethodCountApp {
    public static void main(String[] args) {
        String[] strs = {"a", "foo", "bar", "foo", "bla"};
        String word = "foo";
        System.out.println(countAppearance(strs, word));
    }

    public static int countAppearance(String[] arr, String t) {
        int count = 0;
        for (String each : arr) {
            if (each.contains(t)) {
                count++;
            }
        }
        return count;
    }
}

