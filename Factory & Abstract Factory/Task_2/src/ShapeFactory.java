public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase(null))
            return null;
        if(shapeType.equalsIgnoreCase("Circle"))
            return new Circle();
        if(shapeType.equalsIgnoreCase("Square"))
            return new Square();
        if(shapeType.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        if(shapeType.equalsIgnoreCase("Triangle"))
            return new Triangle();
        return null;
    }
}
