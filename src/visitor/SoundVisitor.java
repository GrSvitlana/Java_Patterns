package visitor;

public class SoundVisitor implements AnimalVisitor {
    @Override
    public void action(Dog dog) {
        System.out.println("WOW");
    }

    @Override
    public void action(Cat cat) {
        System.out.println("MEW");
    }
}