package commandPattern;

public class RemoteControl {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public String clickButton() {
        if (command == null) {
            return "No command assigned to the button!";
        }
        return command.execute();
    }
}