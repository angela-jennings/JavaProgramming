package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
      count(8);
      count(100);
      int num2 = 50;
      count(num2);
      String word = "wooden spoon";
      count(word.length()); //uses length of word for value of count

      printAge(1990);


    }
public static void count(int num){
        for(int i = 0; i <=num; i++){
            System.out.print(i + " ");
        }
    System.out.println();
}

public static void printAge(int year){
    System.out.println("Age is: " + (2021-year) + " Birth year: " + year);
}

}
