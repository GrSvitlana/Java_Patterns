package memento;

public class Originator {
    String state;

    public void setState(String state) {
        this.state = state;
    }

    public Momento saveState() {
        return new Momento(this.state);
    }

    public void restoreFromMomento(Momento momento) {
        this.state = momento.state;
    }

    static class Momento {
        String state;

        public Momento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}