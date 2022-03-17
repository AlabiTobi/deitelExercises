package tddClass;

public class AutomatedBike {
    private boolean powerOn;
    private int speed;

    public void powerOn(){
        powerOn = !powerOn;
    }

    public boolean getPowerOn() {
        return powerOn;
    }

    public void speed(int speed) {
        this.speed= speed;
    }

    public void acceleration() {
        if (speed >= 0 && speed < 20) speed= speed+1;
        if (speed >= 20 && speed < 30) speed= speed+2;
        if (speed >= 30 && speed < 42) speed= speed+3;
        if (speed > 42) speed= speed+4;
    }
    public void deceleration(){
        if (speed >=40) speed= speed-4;
        if (speed >= 30 && speed < 40) speed= speed-3;
        if (speed >= 20 && speed < 30) speed= speed-2;
        if (speed < 20) speed= speed-1;
    }

    public int getSpeed() {
        return speed;

    }
}
