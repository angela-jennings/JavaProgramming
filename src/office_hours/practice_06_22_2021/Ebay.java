package office_hours.practice_06_22_2021;

public class Ebay extends OnlineShopping implements AllowUsersToSell{
    @Override
    public boolean payForShipping(double price) {
        return price < 100;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying and item from Ebay");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning an item to Ebay");
    }

    @Override
    public void viewCart() {
        System.out.println("Viewing Ebay cart");
    }

    @Override
    public void uploadProduct() {
        System.out.println("Ebay Seller");
    }
}
