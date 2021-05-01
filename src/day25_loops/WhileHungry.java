package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int fullBananas = 15;

        while (isHungry) {
            bananas++;
            System.out.println("eat a banana!!" + bananas + " \uD83C\uDF4C");
            //isHungry = bananas == fullBananas ? false : true;
            if (bananas == fullBananas) {
                isHungry = false;
                System.out.println("ENOUGH BANANAS ALREADY. YOURE GOING TO DIE FROM POTASSIUM OVERDOSE");
            }


        }
    }}




