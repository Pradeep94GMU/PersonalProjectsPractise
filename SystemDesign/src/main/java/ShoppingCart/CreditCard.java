package ShoppingCart;

public class CreditCard implements PaymentStrategy {

    String cardNumber;
    String cvv;
    String expiryDate;

    public CreditCard(String cardNumber, String cvv, String expiryDate){
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount +" paid with card");
    }

}




