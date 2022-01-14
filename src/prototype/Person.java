package prototype;

public class Person implements Cloneable {
    String name;
    int age;
    final Address address;

    public Person(String name, int age, Address address) {
        System.out.println("Constructor [public Person(String name, int age, Address address)]");
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(Person person) {
        System.out.println("Constructor [public Person(Person person)]");
        this.name = person.name;
        this.address = person.address;
        this.age = person.age;
    }
}