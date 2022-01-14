package decorator;

public class PepperoniPizza implements Pizza {
    Pizza pizza;

    public PepperoniPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + " + pepperoni";
    }
}