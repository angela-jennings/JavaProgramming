package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {

        System.out.println(getDayName(1));
        System.out.println(getDayName(4));
        System.out.println(getDayName(9));

        for(int i = 1; i<=8; i++){
            System.out.println(i + " = " + getDayName(i));
        }
        String today = getDayName(6); //assign variable today to method getNameDay at case 6
        System.out.println("today = " + today);
        String someDay = getDayName(0); //getDayName at 0 doesnt exit, return will be null
        if(someDay == null){
            System.out.println("invalid day");
        }
        System.out.println("------switch statement with 1 return--------");
        System.out.println(getDayNameV2(4));
        System.out.println(getDayNameV2(3));
        System.out.println(getDayNameV2(9));

    }



    public static String getDayName(int day) {
        switch (day) {
            case 1:
                return "Monday";
            // break; statement does nothing because the return already exits the code
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                System.out.print("Invalid day - " + day + " | ");

                return null;
            // return "Invalid Day";
        }
    }

        public static String getDayNameV2(int day2){
            String dayName = "";
            switch(day2){
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
                case 7:
                    dayName = "Sunday";
                    break;
                default:
                    dayName = "Not valid day";
            }
            return dayName;
        }



    }

