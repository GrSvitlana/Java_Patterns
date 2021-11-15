package strategy;

public abstract class Car {
    FlyAble flyAble;

    public Car(FlyAble flyAble) {
        this.flyAble = flyAble;
    }

    public void fly() {
        flyAble.fly();
    }
}