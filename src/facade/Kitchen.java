package facade;

public class Kitchen {
    Facade kitchenFacade = new Facade();

    public void pressButton(String channel, String temperature) {
        kitchenFacade.pressButton(channel, temperature);
    }
}