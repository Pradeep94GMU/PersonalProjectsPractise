package factoryMethod;

public class MainTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        shape sh = shapeFactory.getShape("rectangle");

sh.draw();
    }

}
