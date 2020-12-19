package prototype;

public class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Inside rectangle draw method");
    }

    public Rectangle() {
        type = Type.Rectangle;
    }
}
