package decorator;

public class CheesePizza implements Pizza {
    Pizza pizza;

    @Override
    public String makePizza() {
        return pizza.makePizza() + " + cheese";
    }

    public CheesePizza(Pizza pizza) {
        this.pizza = pizza;
    }
}