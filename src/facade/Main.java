package facade;

public class Main {
    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom();
        livingRoom.pressButton("1", "22");

        Kitchen kitchen = new Kitchen();
        kitchen.pressButton("3", "18");
    }
}