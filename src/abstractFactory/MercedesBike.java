package abstractFactory;

public class MercedesBike implements Bike {

    @Override
    public void drive() {
        System.out.println("Mercedes bike");
    }
}