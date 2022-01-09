package template;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee.makeBeverage();

        Beverage tea = new Tea();
        tea.makeBeverage();
    }
}