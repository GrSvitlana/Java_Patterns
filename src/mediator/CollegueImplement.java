package mediator;

public class CollegueImplement extends Collegue {

    public CollegueImplement(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    void printMessage(String message) {
        System.out.println(name + " get message: " + message);
    }
}