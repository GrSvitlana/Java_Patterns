package state;

public class Winner extends State {
    @Override
    public void insert(GumMachine gumMachine) {
        System.out.println("you are winner");
    }

    @Override
    public void turn(GumMachine gumMachine) {
        System.out.println("get gum");
        gumMachine.state = new NoQuarter();
    }
}