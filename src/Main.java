public class Main {
    public static void main(String[] args) {
        //Creazione istanze di Interfaccia Shape utilizzando ShapeFactory con tipo di forma ShapeEnum
        Shape circle = ShapeFactory.getShape(ShapeEnum.CIRCLE);
        Shape rectangle = ShapeFactory.getShape(ShapeEnum.RECTANGLE);
        Shape square = ShapeFactory.getShape(ShapeEnum.SQUARE);
        Shape triangle = ShapeFactory.getShape(ShapeEnum.TRIANGLE);

        //metodo draw di Interfaccia Shape per ogni forma
        circle.draw();
        rectangle.draw();
        square.draw();
        triangle.draw();
    }
}