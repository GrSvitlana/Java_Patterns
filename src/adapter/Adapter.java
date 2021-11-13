package adapter;

public class Adapter implements EuroSocket {
    AmericanSocket americanSocket;

    public Adapter(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    @Override
    public void getPower() {
        americanSocket.getPower();
    }
}