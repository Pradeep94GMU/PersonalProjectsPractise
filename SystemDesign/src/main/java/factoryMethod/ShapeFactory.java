package factoryMethod;

public class ShapeFactory {

    public shape getShape(String input){

        if(input.equals("circle")){
            return new Circle();
        }
        else if(input.equals("rectangle")){
            return new Rectangle();
        }
        else{
            return null;
        }
    }
}
