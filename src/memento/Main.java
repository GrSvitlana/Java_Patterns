package memento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Originator.Momento> list = new ArrayList<>();

        Originator originator = new Originator();
        originator.setState("one");
        list.add(originator.saveState());
        originator.setState("two");
        list.add(originator.saveState());
        originator.setState("three");
        System.out.println(originator.state);
        originator.restoreFromMomento(list.get(0));
        System.out.println(originator.state);
    }
}