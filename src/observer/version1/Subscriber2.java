package observer.version1;

public class Subscriber2 implements MyObservable {
    @Override
    public void callMe(String msg) {
        System.out.println("S2 " + msg);
    }
}