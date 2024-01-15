public enum ShapeEnum {
    //Cre una enum che abbia tutti i tipi di shape che hai creato ( cerchio, rettangolo, etc)
    CIRCLE("Circle"),
    RECTANGLE("Rectangle"),
    SQUARE("Square"),
    TRIANGLE("Triangle");

    private String shape;

    ShapeEnum(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
