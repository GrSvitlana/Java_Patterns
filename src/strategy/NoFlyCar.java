package strategy;

public class NoFlyCar implements FlyAble {
    @Override
    public void fly() {
        System.out.println("NO FLY");
    }
}