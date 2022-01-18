package observer.version1;

public class Subscriber1 implements MyObservable {
    @Override
    public void callMe(String msg) {
        System.out.println("S1 " + msg);
    }
}