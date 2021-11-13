package brige;

public class Track extends Vehicle{

    @Override
    void drive() {
        models.drive("TRACK");
    }

    public Track(Models models) {
        super(models);
    }
}