package observer.version2;

public class Main {
    public static void main(String[] args) {
        Subject2 subject2 = new Subject2();
        subject2.addObserver(new Subscriber3());
        subject2.addObserver(new Subscriber4());
        subject2.setChange();
        subject2.notifyObservers("HI!!!!");
    }
}