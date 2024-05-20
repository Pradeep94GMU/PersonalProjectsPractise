package ShoppingCart.context;

import ShoppingCart.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class CartShop {

  List<Item> items;
  protected PaymentStrategy paymentStrategy;

  public CartShop(){
    this.items = new ArrayList<>();
  }

  public void addItem(Item item){
    items.add(item);
  }

  public void removeItem(Item item){
    items.remove(item);
  }

  public int calTotal(){
    int sum = 0;
    for(Item item: items){
      sum += item.getAmount();

    }

    return sum;
  }

  public void setPaymentStrategy(PaymentStrategy paymentStrategy){
    this.paymentStrategy = paymentStrategy;
  }

  public void pay(){

    //to do the payment, we need the total amount
    int total = calTotal();
    paymentStrategy.pay(total);

  }

}
