package decoratorPattern;

public abstract class PizzaDecorator implements Pizza{

  protected Pizza basePizza; //has-A relationship

  public PizzaDecorator(Pizza newPizza){
    this.basePizza = newPizza;


  }

  public String getDescription() {
    return basePizza.getDescription();
  }


  public double cost() {
    return basePizza.cost();
  }

}
