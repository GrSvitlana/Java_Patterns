package brige;

public abstract class Vehicle {
    Models models;

    public Vehicle(Models models) {
        this.models = models;
    }

    abstract void drive();
}