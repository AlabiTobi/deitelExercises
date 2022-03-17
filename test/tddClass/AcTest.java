package tddClass;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AcTest{
    private int temperature;


        @Test
        public void noArgTest(){
            Ac ac = new Ac();
            assertEquals(16, ac.getTemperature());


        }


    }

