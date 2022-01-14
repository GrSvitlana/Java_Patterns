package facade;

public class LivingRoom {
    Facade livingRoomFacade = new Facade();

    public void pressButton(String channel, String temperature) {
        livingRoomFacade.pressButton(channel, temperature);
    }
}