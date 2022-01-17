package state;

import java.util.Random;

public class NoQuarter extends State {

    @Override
    public void insert(GumMachine gumMachine) {
        if (new Random().nextBoolean()) {
            System.out.println("you are winner");
            gumMachine.state = new Winner();
        } else {
            gumMachine.state = new HasQuarter();
        }
    }

    @Override
    public void turn(GumMachine gumMachine) {
        System.out.println("no quarter");
    }
}