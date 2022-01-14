package prototype;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Kollontay", 15);
        Person person = new Person("Mike", 37, address);

        Person person2 = new Person(person);
        System.out.println("----------------------------------");
        System.out.println(person != person2);
        System.out.println(person.name == person2.name);
        System.out.println(person.address.street == person2.address.street);
        System.out.println("----------------------------------");

        person.name = "new name";
        System.out.println(person2.name);

        person.address.street = "new street";
        System.out.println(person2.address.street);
    }
}