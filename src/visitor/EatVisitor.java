package visitor;

public class EatVisitor implements AnimalVisitor {
    @Override
    public void action(Dog dog) {
        System.out.println("MEat");
    }

    @Override
    public void action(Cat cat) {
        System.out.println("Fish");
    }
}