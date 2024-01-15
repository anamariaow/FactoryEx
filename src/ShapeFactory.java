public class ShapeFactory {
    //Crea una factory class che abbia un metodo che ritorni la forma corretta (shape) in base all'enum in input.
    public static Shape getShape(ShapeEnum type) {
        Shape shape = switch (type) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            case SQUARE -> new Square();
            case TRIANGLE -> new Triangle();
            default -> throw new RuntimeException("Shape not found" + type);
        };
        return shape;
    }
}
