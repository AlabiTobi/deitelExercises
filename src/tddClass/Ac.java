package tddClass;

public class Ac {
    private int temperature=16;
    private boolean isOn;
    public Ac(){

    }
    public Ac(int newTemperature){
        temperature = newTemperature;
    }
    public Ac(boolean isOn, int temperature){
        this.isOn = isOn;
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
}
