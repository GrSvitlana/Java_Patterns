package abstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory bmw_factory = new BMWFactory();
        Car car = bmw_factory.getCar();
        Bike bike = bmw_factory.getBike();

        car.drive();
        bike.drive();

        AbstractFactory mercedes_factory = new MercedesFactory();
        Car car1 = mercedes_factory.getCar();
        Bike bike1 = mercedes_factory.getBike();

        car1.drive();
        bike1.drive();
    }
}