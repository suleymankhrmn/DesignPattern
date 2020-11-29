package factory2;

public class Main {
    public static  void main(String[] args){
        Car car1 = CarsFactory.getCar(CarType.FORD);
        Car car2 = CarsFactory.getCar(CarType.FERRARI);
        System.out.println(car1.getDescription());
    }
}
