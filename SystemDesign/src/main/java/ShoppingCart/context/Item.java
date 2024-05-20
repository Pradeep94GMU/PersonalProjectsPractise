package ShoppingCart.context;

public class Item {
    String id;
    int amount;

    public Item(String id, int amount){
        this.amount = amount;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
