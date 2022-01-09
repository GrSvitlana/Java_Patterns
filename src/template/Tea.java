package template;

public class Tea extends Beverage {
    @Override
    void addBeverage() {
        System.out.println("Making Tea");
    }

    @Override
    void addCondiment() {
        System.out.println("Add lemon");
    }
}