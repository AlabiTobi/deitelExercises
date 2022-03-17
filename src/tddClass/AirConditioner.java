package tddClass;

public class AirConditioner {
private int temperature =16;

    public boolean isOn(boolean status) {
        return true;
    }

    public boolean isOff(boolean status) {
        return false;
    }

    public int increase(int temperature) {
        temperature = temperature+1;
        return temperature;
    }

    public int decrease(int temperature) {temperature=temperature-1;
        return temperature;
    }

    public int beyond(int temperature) {
        if (temperature>30) temperature=30;
            return temperature;
    }

    public int below(int temperature) {
        if (temperature<16) temperature=16;
            return temperature;
    }
}

