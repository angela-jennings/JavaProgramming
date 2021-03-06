package day18_conditions_practice_strings_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int month = 22;

        switch (month) {
            case 12: case 1: case 2:
                System.out.println("Month is Winter");
                break;

            case 3: case 4: case 5:
                System.out.println("Month is Spring");
                break;

            case 6: case 7: case 8:
                System.out.println("Month is Summer");
                break;

            case 9: case 10: case 11:
                System.out.println("Month is Fall");
                break;

            default:
                System.out.println("Not a valid month");




        }
    }
}
