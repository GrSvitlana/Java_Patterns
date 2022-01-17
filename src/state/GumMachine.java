package state;

public class GumMachine {
    State state = new NoQuarter();

    public void insert() {
        state.insert(this);
    }

    public void setState() {
        state.turn(this);
    }
}