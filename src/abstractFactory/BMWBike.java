package abstractFactory;

public class BMWBike implements Bike {

    @Override
    public void drive() {
        System.out.println("BMW bike");
    }
}