package decoratorPattern;

public class Mozirela extends PizzaDecorator {


    public Mozirela(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return basePizza.getDescription() + ", Mozirala";
    }


    public double cost() {
        return basePizza.cost() + 20;
    }
}
