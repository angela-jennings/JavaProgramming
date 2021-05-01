package day28_loops;

public class JavaCityCases {
    public static void main(String[] args) {
        // loop day = 1 till 30
        //every day there are 200 new cases, every sunday there are 500 new cases
        //ever sunday (day%7 == 0) there are 500 new cases
        //"day 1 - daily cases: 200
        //"day 2 - daily cases: 200
        //"day 3 - daily cases: 200
        //"day 7 - daily cases: 500

        //then print total cases

        int totalCases = 0;
        for (int day = 1; day <= 30; day++) { //day is the new variable that has the count of +1. when day is divisible by 7, that means it is a sunday and cases increase on sundays by 500. using the += adds the value to total cases for every day that day increases by 1
            if( day%7 == 0) {
                totalCases += 500;
            }else{
            totalCases += 200;

            }
            System.out.println("day = " + day + " | total cases = " + totalCases);

        }
        System.out.println("total cases = " + totalCases);
    }}
