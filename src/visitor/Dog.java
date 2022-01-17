package visitor;

public class Dog implements Animal {
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.action(this);
    }
}