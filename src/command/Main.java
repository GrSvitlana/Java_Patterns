package command;

public class Main {
    public static void main(String[] args) {
        Command command = new LightCommand(new Light());
        Command command1 = new MusicPlayerCommand(new MusicPlayer());
        Command command2 = new CoffeeMachineCommand(new CoffeeMachine());
        Command command3 = new LightAndMusicCommand(new MusicPlayer(), new Light());
        Command command4 = new PhoneCommand(new Phone(), "Mike");
        Button button = new Button(command);
        button.pressButton();
    }
}