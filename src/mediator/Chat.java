package mediator;

public interface Chat {
    void sendMessage(String message, Collegue collegue);

    void addCollegue(Collegue collegue);
}