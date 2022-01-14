package decorator;

public class DoughPizza implements Pizza {
    @Override
    public String makePizza() {
        return "dough";
    }
}