package factory2;

public class CarsFactory {
    public static Car getCar(CarType type){
        return type.getConstructor().get();
    }
}
