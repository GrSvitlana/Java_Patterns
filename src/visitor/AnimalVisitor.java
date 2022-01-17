package visitor;

public interface AnimalVisitor {
    void action(Dog dog);

    void action(Cat cat);
}