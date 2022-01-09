package template;

public abstract class Beverage {
    abstract void addBeverage();

    abstract void addCondiment();

    private void boilWater() {
        System.out.println("Water boiled");
    }

    private void addSugar() {
        System.out.println("Adding sugar");
    }

    public void makeBeverage() {
        boilWater();
        addSugar();
        addBeverage();
        addCondiment();
        hook();
    }
    void hook() {}
}