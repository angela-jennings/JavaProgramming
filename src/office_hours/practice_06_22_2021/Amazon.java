package office_hours.practice_06_22_2021;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class Amazon extends OnlineShopping implements AllowUsersToSell {

    @Override
    public boolean payForShipping(double price) {
        return price < 50;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying an item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning and item to Amazon");
    }

    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon cart");
    }

    @Override
    public void uploadProduct() {
        System.out.println("Amazon Seller");
    }
}
