package builder;

public class Main {
    public static void main(String[] args) {
        Person person1 = new PersonBuilder()
                .setName("Pol").setAge(45).setSalary(654456).build();
        System.out.println(person1.toString());
    }
}