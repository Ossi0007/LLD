package src.main.java.factory;

public class ShapeFactory {
    Shape getShape(String input){

        //switch expression
        return switch (input) {
            case "CIRCLE" -> new Circle();
            case "SQUARE" -> new Square();
            case "RECTANGLE" -> new Square();
            default -> null;
        };

//        switch (input) {
//            case "CIRCLE":
//                return new Circle();
//            case "SQUARE":
//                return new Square();
//            case "RECTANGLE":
//                return new Square();
//
//            default:
//                throw new IllegalStateException("Unexpected value: " + input);
//        }
    }
}
