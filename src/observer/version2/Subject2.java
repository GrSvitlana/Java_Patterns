package observer.version2;

import java.util.Observable;

public class Subject2 extends Observable {
    protected synchronized void setChange() {
        super.setChanged();
    }
}