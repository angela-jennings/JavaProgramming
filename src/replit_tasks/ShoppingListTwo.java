package replit_tasks;
import java.util.Scanner;

public class ShoppingListTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String continueItem = "";
        String moreItem = "Add one more item?";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        System.out.println("Enter Item" + count + " and its price:");
        item = scan.next();
        price = scan.nextDouble();
        moreItem = "Add one more item?";
        System.out.println(moreItem);
        continueItem = scan.next();
        shoppingListReport += "Item" + count + ": " + item + " Price: " + price;
        count++;
        totalPrice += price;

        do {
            if(continueItem.equals("no")){
            break;
            }
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            moreItem = "Add one more item?";
            System.out.println(moreItem);
            continueItem = scan.next();
            shoppingListReport += ", " + "Item" + count + ": " + item + " Price: " + price;
            count++;
            totalPrice += price;

            }while (continueItem.equals("yes")) ;
            System.out.println(shoppingListReport);
            System.out.println("Total price: " + totalPrice);


        }
    }




















/* In this assignment, you will write a program that will generate a shopping list. It's more advanced version of assignment Shopping list I.

\\ur program should ask use to enter items followed by its price. After adding item, ask user if he wants to add one more item. If so, repeat previous steps again. If no, print shopping list report and total price as show in examples. Your program should accept up to 10 items.

Hint: use do while loop.

Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String continueItem = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        System.out.println("Enter Item" + count +  " and its price:");
        item = item + scan.next() + " Price: " + price + " ";
        price = price + scan.nextDouble();
        String moreItem =  "Add one more item?";
        System.out.println(moreItem);
        continueItem = scan.next();

       if(continueItem.equals("no")){
           System.out.println(item + price + ", ");
           System.out.println(price += totalPrice);
       }else{
           while(continueItem.equals("yes")){
               count ++;
               System.out.println("Enter Item" + count +  " and its price:");
               item = item + scan.next() + " Price: " + price + " ";
               price = price + scan.nextDouble();
               moreItem =  "Add one more item?";
               System.out.println(moreItem);
               continueItem = scan.next();


           }
           System.out.println(item + price + ", ");
           System.out.println(price += totalPrice);
       }






    }
}

*/