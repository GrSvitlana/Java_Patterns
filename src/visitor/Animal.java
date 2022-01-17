package visitor;

public interface Animal {
    default void accept(AnimalVisitor animalVisitor) {
    }
}