package state;

public class HasQuarter extends State {
    @Override
    public void insert(GumMachine gumMachine) {
        System.out.println("you have already set the quarter");
    }

    @Override
    public void turn(GumMachine gumMachine) {
        if (count <= 0) {
            gumMachine.state = new SoldOut();
        } else {
            System.out.println("selling ,,,");
            count--;
            gumMachine.state = new NoQuarter();
        }
    }
}