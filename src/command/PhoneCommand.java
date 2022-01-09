package command;

public class PhoneCommand implements Command {
    Phone phone;
    String name;

    public PhoneCommand(Phone phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    @Override
    public void execute() {
        phone.makeCall(name);
    }
}