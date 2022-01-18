package observer.version2;

import java.util.Observable;
import java.util.Observer;

public class Subscriber3 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("S3 " + arg);
    }
}