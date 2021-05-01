package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum =1;

        if(floorNum==1) {
            System.out.println("Floor 1 selected. \nCompanies: Lobby, Verizon, Starbucks");
        }else if(floorNum==2){
            System.out.println("Floor 2 selected. \nCompanies: Cybertek, NASA, Intelsat");
        }else if(floorNum==3){
            System.out.println("Floor 3 selected. \nCompanies: Lyft, BofA, Steak House");
        }else{
            System.out.println("Floor number invalid - " + floorNum);
        }

        System.out.println("=================SWITCH STATEMENT VERSION=================");

        floorNum = 4;
        switch(floorNum){
            case 1:
                System.out.println("Floor 1 selected. \nCompanies: Lobby, Verizon, Starbucks");
                break;
            case 2:
                 System.out.println("Floor 2 selected. \nCompanies: Cybertek, NASA, Intelsat");
                 break;
            case 3:
                 System.out.println("Floor 3 selected. \nCompanies: Lyft, BofA, Steak House");
                 break;
            default:
                System.out.println("That is not a valid floor");


        }

    }
}
