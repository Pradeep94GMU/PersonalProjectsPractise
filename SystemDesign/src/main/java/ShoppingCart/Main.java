package ShoppingCart;

import ShoppingCart.context.CartShop;
import ShoppingCart.context.Item;

public class Main {
    public static void main(String[] args) {

        CartShop cartShop = new CartShop();

        cartShop.addItem(new Item("101", 1000));
        cartShop.addItem(new Item("131", 65));
        cartShop.addItem(new Item("11", 299));
        cartShop.addItem(new Item("34", 400));

        System.out.println("Total item cost:"+ cartShop.calTotal());

        cartShop.setPaymentStrategy(new CreditCard("123456", "987", "12-10-2026"));
        cartShop.pay();

        cartShop.setPaymentStrategy(new Paypal("hello@world.com", "12345"));
        cartShop.pay();


    }
}
