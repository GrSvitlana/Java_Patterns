package adapter;

public class Main {
    public static void main(String[] args) {
        SimpleAmericanSocket socket = new SimpleAmericanSocket();
        Radio radio = new Radio();

        Adapter adapter = new Adapter(socket);
        radio.listenToMusic(adapter);
    }
}