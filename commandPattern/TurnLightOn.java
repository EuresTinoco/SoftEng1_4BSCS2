package commandPattern;

public class TurnLightOn implements Command {
    private Light light;

    public TurnLightOn(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.turnOn();
    }
}