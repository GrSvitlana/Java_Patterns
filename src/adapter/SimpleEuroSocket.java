package adapter;

public class SimpleEuroSocket implements EuroSocket{

    @Override
    public void getPower() {
        System.out.println("Euro voltage");
    }
}