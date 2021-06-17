package office_hours.practice_no_dates;

public class CountJava {
    public static void main(String[] args) {
        String str = "java is fun. java class today, not javascript";
        int count = 0;

        while(str.contains("java")){
            count++;
            str = str.replaceFirst("java", "");
        }
        System.out.println("java was found " + count + " times");
    }
}
