package commandPattern;

public class Light {
    private int brightness = 100;

    public String turnOn() {
        return "Lights turned on at " + brightness + "% brightness.";
    }

    public String turnOff() {
        return "Lights turned off.";
    }
}