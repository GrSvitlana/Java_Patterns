package command;

public class CoffeeMachineCommand implements Command {
    CoffeeMachine coffeeMachine;

    public CoffeeMachineCommand(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void execute() {
        coffeeMachine.makeCoffee();
    }
}