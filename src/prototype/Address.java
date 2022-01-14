package prototype;

public class Address implements Cloneable {
    String street;
    int number;

    public Address(String street, int number) {
        System.out.println("Constructor [public Address(String street, int number)]");
        this.street = street;
        this.number = number;
    }

    public Address(Address address) {
        System.out.println("Constructor [public Address ( Address address)]");
        this.street = address.street;
        this.number = address.number;
    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}