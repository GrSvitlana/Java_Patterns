package template;

public class Coffee extends Beverage {
    @Override
    void addBeverage() {
        System.out.println("Making Coffee");
    }

    @Override
    void addCondiment() {
        System.out.println("Add milk");
    }
}