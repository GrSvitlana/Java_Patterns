package state;

public class SoldOut extends State {
    @Override
    public void insert(GumMachine gumMachine) {
        System.out.println("no gums");
    }

    @Override
    public void turn(GumMachine gumMachine) {
        System.out.println("no gums");
    }
}