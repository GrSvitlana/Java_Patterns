package visitor;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.accept(new SoundVisitor());
        animal.accept(new EatVisitor());
    }
}