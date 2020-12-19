package prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<Type,Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(Type type){
        Shape cachedShape = shapeMap.get(type);
        return (Shape) cachedShape.clone();
    }

    public static void loadShape(){
        Circle circle = new Circle();
        shapeMap.put(circle.getType(),circle);

        Square square = new Square();
        shapeMap.put(square.getType(),square);

        Rectangle rectangle = new Rectangle();
        shapeMap.put(rectangle.getType(),rectangle);
    }
}
