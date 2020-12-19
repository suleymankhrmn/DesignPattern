package prototype;

public class Square extends Shape{
    @Override
    void draw() {
        System.out.println("Inside Square draw method");
    }

    public Square() {
        type = Type.Square;
    }
}
