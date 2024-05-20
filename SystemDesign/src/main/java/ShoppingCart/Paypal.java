package ShoppingCart;

public class Paypal implements PaymentStrategy {

  String email;
  String password;

  public Paypal(String email, String password){
    this.email = email;
    this.password = password;
  }

  @Override
  public void pay(int amount){
    System.out.println(amount +" paid with paypal");
  }

}
