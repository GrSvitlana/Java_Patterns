package brige;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(new Audi());
        Vehicle vehicle1 = new Track(new Audi());
        vehicle.drive();
        vehicle1.drive();
    }
}