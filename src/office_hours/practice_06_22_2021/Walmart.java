package office_hours.practice_06_22_2021;

public class Walmart extends OnlineShopping {
    @Override
    public void viewCart() {
        System.out.println("Viewing Walmart cart online");
    }

    @Override
    public boolean payForShipping(double price) {
        return true;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Walmart online");
    }

    @Override
    public void returnItem() {
        System.out.println("Return item to Walmart online");
    }
}
