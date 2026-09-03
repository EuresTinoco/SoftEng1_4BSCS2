package commandPattern;

public class Thermostat {
    private int temperature = 22; // default Celsius

    public String increaseTemperature() {
        temperature++;
        return "Thermostat temperature increased to " + temperature + "°C.";
    }

    public String decreaseTemperature() {
        temperature--;
        return "Thermostat temperature decreased to " + temperature + "°C.";
    }
}