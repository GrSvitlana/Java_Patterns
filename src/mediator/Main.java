package mediator;

public class Main {
    public static void main(String[] args) {
        Chat chat = new ChatMediator();
        CollegueImplement mike = new CollegueImplement(chat, "Mike");
        chat.addCollegue(mike);

        chat.addCollegue(new CollegueImplement(chat, "Den"));
        chat.addCollegue(new CollegueImplement(chat, "Rob"));

        mike.sendMessage("Hi");
    }
}