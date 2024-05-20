package decoratorPattern;

public class PlainPizza implements Pizza {

  @Override
  public String getDescription() {
    return "Base Pizza";
  }

  @Override
  public double cost() {
    return 10;
  }
}
