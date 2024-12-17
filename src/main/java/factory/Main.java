package src.main.java.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
        shape = shapeFactory.getShape("RECTANGLE");
        shape.draw();
        shape = shapeFactory.getShape("AALOO");
        shape.draw();
    }
}
