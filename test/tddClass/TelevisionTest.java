package tddClass;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
public class TelevisionTest {
    @Test
    public void TelevisionOn() {
        Television tV = new Television();
        assertEquals(false, tV.getPowerOn());
        tV.powerOn();
        assertEquals(true, tV.getPowerOn());
    }
    @Test
    public void TelevisionOff() {
        Television tV = new Television();
        tV.powerOn();
        assertEquals(true, tV.getPowerOn());
        tV.powerOn();
        assertEquals(false, tV.getPowerOn());
    }
    @Test
    public void TelevisionChannelUp() {
        Television tV = new Television();
        tV.powerOn();
        assertEquals(true, tV.getPowerOn());
        tV.channelUp(7);
        assertEquals(8, tV.getChannelUp());
    }
    @Test
    public void TelevisionChannelDown() {
        Television tV = new Television();
        tV.powerOn();
        assertEquals(true, tV.getPowerOn());
        tV.channelDown(16);
        assertEquals(15, tV.getChannelDown());
    }
    @Test
    public void TelevisionVolumeUp() {
        Television tV = new Television();
        tV.powerOn();
        assertEquals(true, tV.getPowerOn());
        tV.volumeUp(15);
        assertEquals(16, tV.getVolumelUp());
    }
    @Test
    public void TelevisionVolumeDown() {
        Television tV = new Television();
        tV.powerOn();
        assertEquals(true, tV.getPowerOn());
        tV.volumeDown(10);
        assertEquals(9, tV.getVolumeDown());
    }
}