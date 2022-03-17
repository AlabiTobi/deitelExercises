package tddClass;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertSame;

public class AutomatedBikeTest {
    @Test
    public void BikeIsOn(){
        AutomatedBike bike= new AutomatedBike();
        assertEquals(false, bike.getPowerOn());
        bike.powerOn();
        assertSame(true,bike.getPowerOn());
    }
    @Test
    public void BikeGearOne(){
        AutomatedBike bike= new AutomatedBike();
        bike.speed(18);
        bike.acceleration();
        assertEquals(19, bike.getSpeed());
    }
    @Test
    public void BikeGearTwo(){
        AutomatedBike bike= new AutomatedBike();
        bike.speed(24);
        bike.acceleration();
        assertEquals(26, bike.getSpeed());
    }
    @Test
    public void BikeGearThree(){
        AutomatedBike bike= new AutomatedBike();
        bike.speed(36);
        bike.acceleration();
        assertEquals(39, bike.getSpeed());
    }
    @Test
    public void BikeGearFour(){
        AutomatedBike bike= new AutomatedBike();
        bike.speed(50);
        bike.acceleration();
        assertEquals(54, bike.getSpeed());
    }
    @Test
    public void BikeGearFourToThree(){
        AutomatedBike bike= new AutomatedBike();
        bike.speed(46);
        bike.deceleration();
        assertEquals(42, bike.getSpeed());
    }
    @Test
    public void BikeGearThreeToTwo(){
        AutomatedBike bike= new AutomatedBike();
        bike.speed(33);
        bike.deceleration();
        assertEquals(30, bike.getSpeed());
    }
    @Test
    public void BikeGearTwoToOne(){
        AutomatedBike bike= new AutomatedBike();
        bike.speed(22);
        bike.deceleration();
        assertEquals(20, bike.getSpeed());
    }

}
