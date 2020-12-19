package prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ShapeCache.loadShape();

        List<Shape> shapes = new ArrayList<>();

        Shape circle = ShapeCache.getShape(Type.Circle);
        shapes.add(circle);
        Shape rectangle = ShapeCache.getShape(Type.Rectangle);
        shapes.add(rectangle);
        Shape square = ShapeCache.getShape(Type.Square);
        shapes.add(square);

        for (Shape shape: shapes) {
            shape.draw();
        }



    }
}
