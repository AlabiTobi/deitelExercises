package tddClass;

public class Television{
    private boolean powerOn;
    private int volume;
    private int channel;

    public void powerOn(){
      powerOn = !powerOn;
    }

    public boolean getPowerOn() {
        return powerOn;
    }

    public void channelUp(int channel) {
        this.channel= ++channel;
    }
    public void channelDown(int channel){
        this.channel= --channel;
    }

    public int getChannelUp() {
        return channel;
    }
    public int getChannelDown(){
        return channel;
    }


    public void volumeUp(int volume) {
        this.volume= ++volume;
    }

    public void volumeDown(int volume) {
        this.volume= --volume;
    }

    public int getVolumeDown() {
        return volume;
    }

    public int getVolumelUp() {
        return volume;
    }
}
