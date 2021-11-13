package brige;

public class Car extends Vehicle{

    @Override
    void drive() {
        models.drive("CAR");
    }

    public Car(Models models) {
        super(models);
    }
}