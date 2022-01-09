package command;

public class Button {
    Command command;

    public Button(Command command) {
        this.command = command;
    }

    void pressButton() {
        command.execute();
    }
}
