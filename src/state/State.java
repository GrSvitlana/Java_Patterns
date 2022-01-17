package state;

public abstract class State {
    int count = 10;
    abstract public void insert(GumMachine gumMachine);
    abstract public void turn(GumMachine gumMachine);
}