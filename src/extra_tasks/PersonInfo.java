package extra_tasks;

public class PersonInfo {
    public static void main(String[] args) {
        String name = "Angela Jennings";
        byte age = 30;
        char gender =70;
        boolean student = true;
        short numOfSiblings = 1;
        long favNum = 666;
        int numOfSeasons = 4;
        double birthMoDate = 05.18;
        int birthYr = 1990;
        String fullBday = "May 18th, 1990";
        String favQuote = "“Do what thou wilt shall be the whole of the Law.”";

        System.out.println("Get to know " + name + ".\nShe is " + age +" years old. Her birthday is on "
                + fullBday + ".");
        System.out.println(name + "' has " + numOfSiblings + " sibling and has " + numOfSeasons + " in her State. ");
        System.out.println(name + "' favorite quote is: " + favQuote + " and her favorite number is " + favNum + ".");
        System.out.println("\n" + name + " is a student: " + student);
        System.out.println("Birthdate: " + birthMoDate + ", " + birthYr);
        System.out.println("Gender: " + gender);


    }
}
