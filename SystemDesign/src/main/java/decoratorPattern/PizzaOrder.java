package decoratorPattern;

public class PizzaOrder {
    public static void main(String[] args) {

        Pizza order2 = new Mozirela(new PlainPizza());

        double cost = order2.cost();
        String description = order2.getDescription();
        System.out.println(cost);
        System.out.println(description);



    }
}
