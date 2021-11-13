package brige;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(new Audi());
        vehicle.drive();
    }
}
