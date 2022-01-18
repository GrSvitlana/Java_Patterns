package mediator;

public abstract class Collegue {
    Chat chat;
    String name;

    public Collegue(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    abstract void sendMessage(String message);

    abstract void printMessage(String message);
}