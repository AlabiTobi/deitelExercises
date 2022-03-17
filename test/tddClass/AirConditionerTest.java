package tddClass;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AirConditionerTest {
    @Test
    public void AirConditioner(){
        AirConditioner aC = new AirConditioner();
        aC.isOn(true);
        assertEquals(true,aC.isOn(true));
    }
    @Test
    public void AirConditionerSwitchOn(){
        AirConditioner aC = new AirConditioner();
        aC.isOff(false);
        assertEquals(false, aC.isOff(false));
    }
    @Test
    public void AirConditionerIncrease(){
        AirConditioner aC= new AirConditioner();
        aC.increase(20);
        assertEquals(21, aC.increase(20));
    }
    @Test
    public void AirConditionerDecrease(){
        AirConditioner aC = new AirConditioner();
        aC.decrease(20);
        assertEquals(19, aC.decrease(20));
    }
    @Test
    public void AirConditionerBeyond(){
        AirConditioner increase= new AirConditioner();
        increase.beyond(32);
        assertEquals(30,increase.beyond(32));
    }
    @Test
    public void AirConditionerBelow(){
        AirConditioner decrease= new AirConditioner();
        decrease.below(12);
        assertEquals(16,decrease.below(14));
    }
}
