package extra_tasks;
import java.util.Locale;
import java.util.Scanner;
import java.util.*;


public class ProblemSet1 {
    public static void main(String[] args) {
        /* [Personal Information -Scanner and If]Ask the user how many people they live with?if user lives with Less than 2 people: print "Live with less than 2 people"if the user lives with 3 -6 people: print "Live with 3 -6 people"if the user lives with more than 6 people: print "Live with "more than 6 people"Ask the user what city they live in?Ask the user if the live in downtown ("yes or no")if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")if they have thought about it print "do it its great", if they have not print "You should think about it"Ask the user their favorite animal?Print "Wow %animal is a great animal"Ask the user how many pets they want?Print "Interesting, do you want %numberOfPets %favoriteAnimals?"----------------------------------------------------------*/

       /* Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int howManyPeople = scan.nextInt();
        if (howManyPeople <= 2) {
            System.out.println("lives with 2 or less people");
        } else if (howManyPeople > 2 && howManyPeople <= 6) {
            System.out.println("lives with 3 - 6 people");
        } else if (howManyPeople > 6) {
            System.out.println("lives with more than 6 people");
        }
        System.out.println("what city do you live in?");
        scan.nextLine();
        String whatCity = scan.nextLine();
        System.out.println("do you live in downtown?");
        String downtown = scan.next();
        if (downtown.equals("no")) {
            System.out.println("you should think about it");
        }
        if (downtown.equals("yes")) {
            System.out.println("have you thought about moving to the suburbs?");
            String suburbs = scan.next();
            if (suburbs.equals("yes")) {
                System.out.println("do it, its great!");
            }
            if (suburbs.equals("no")) {
                    System.out.println("you should think about it");
                }
            }
        System.out.println("what is your favorite animal?");
        scan.nextLine();
        String favoriteAnimal = scan.nextLine();
        System.out.println("wow! " + favoriteAnimal + " is so cool!");
        System.out.println("how many pets do you want? ");
        int howManyPets = scan.nextInt();
        System.out.println("Do you want " + howManyPets + " " + favoriteAnimal + "'s?");
        String wantNumPets = scan.next(); */

        /* Analyze each step, What is the result of a, b, and c?
        int a = 3,  b = 2;long c = (a--+ b) * 2 / 3 % 2;

        int a = 3; //2
        int b = 2;
        long c = (a--+b) * 2/3 %2;
        System.out.println("a = " + a); //2
        System.out.println("b = " + b); //2
        System.out.println("c = " + c); //1*/

        /*Analyze each step, What is the result numOne, numTwo, and biggest?int numOne = 10;int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;int biggest = numOne > numTwo ? numOne : numTwo;

        int numOne = 10; //11/ 12/ 13
        int numTwo = numOne++ * 3 + ++numOne + numOne++ %2; //10 * 3 + 12 + 12 %2
        int biggest = numOne > numTwo ? numOne : numTwo;

        System.out.println("numOne = " + numOne); //13
        System.out.println("numTwo - " + numTwo); //42
        System.out.println("biggest = " + biggest); //num2*/


        /* [Pandemic Checker]Write a program that will read a number from the user. This number will be a year. Use that given year to figure out if there was a pandemic in that year, and if there was which one. Data to use:1346-1353: The Black Death1665-1666: Great Plague of London1770-1772: Russian plague1889-1890: Flu pandemic1916: American polio epidemic1918-1920: Spanish Flu 2009-2010: H1N1 Swine Flu pandemic2014-2016: West African Ebola epidemic2020-2021: COVID-19Less than 0 and more then 2021: Invalid year Any year not in those ranges: No Pandemic*/

   int year = 0;
   if(year >= 1346 && year <= 1353){
       System.out.println("Black Death");
   }else if(year>=1665 && year <=1666){
       System.out.println("Great Plague of London");
   }else if(year >= 1770 && year <= 1772){
       System.out.println("Russian Plague");
        }else if(year >=1889 && year<=1890){
       System.out.println("Flu Pandemic");
   }else if(year == 1916){
       System.out.println("American Polio Epidemic");
   }else if(year>= 1918 && year<=1920){
       System.out.println("Spanish Flu Pandemic");
        }else if(year>=2009 && year <=2010){
       System.out.println("H1N1 Swine Flu Pandemic");
   }else if(year >=2014 && year <= 2016){
       System.out.println("West African Ebola Epidemic");
   }
}}
