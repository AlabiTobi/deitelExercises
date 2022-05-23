package tddClass;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class KataTest {
    @Test
    public void additionTest() {
        Kata user1 = new Kata();
        int result = user1.addition(14000, 1000);
        assertEquals(15000, result);
    }

    @Test
    public void subtractionTest() {
        Kata tobi = new Kata();
        int result = tobi.subtraction(22, 125);
        assertEquals(103, result);

    }

    @Test
    public void areaCircleTest() {
        Kata tobi = new Kata();
        double result = tobi.circleArea(7);
        assertEquals(154.0, result);
    }

    @Test
    public void bitFlipperTest() {
        Kata tobi = new Kata();
        int result = tobi.flip(9);
        assertEquals(9, result);
    }
    @Test
        public void quotientTest(){
        Kata tobi = new Kata();
        int result= tobi.quotient(10,2);
        assertEquals(5,result);
        }
@Test
        public void evenNumber(){
    int evenNumber= 2;
    while(evenNumber<=100){
        System.out.print(evenNumber+ " ");
        evenNumber = evenNumber +2;
}

    }

}
