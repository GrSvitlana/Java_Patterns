package observer.version1;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Subscriber1 subscriber1 = new Subscriber1();

        subject.subscribe(subscriber1);
        subject.subscribe(new Subscriber2());
        subject.notifySubscribers("Hello");
        subject.unSubscribe(subscriber1);
        subject.notifySubscribers("Hello!!!");
    }
}