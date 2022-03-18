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
    public void quotientTest() {
        Kata tobi = new Kata();
        int result = tobi.quotient(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void evenNumber() {
        int evenNumber = 2;
        while (evenNumber <= 100) {
            System.out.print(evenNumber + " ");
            evenNumber = evenNumber + 2;
        }
    }

    //write a function on data class that takes in an integer and return true if its eveNumber and return false if not an evenNumber
    @Test
    public void evenNumberOne() {
       Kata evenNumber= new Kata();
       evenNumber.isEven(6);
       assertEquals(true, evenNumber.isEven(6));
    }
    @Test
    public void biggestNumber(){
        Kata tobi= new Kata();
        int bigNumber=tobi.bigNumber(1,3,5,7,3);
        assertEquals(7, bigNumber);
    }
    @Test
    public void factorNumber(){
        Kata tobi= new Kata();
        int myNumber =tobi.factorNumber(49);
        assertEquals(3,myNumber);

    }
    //write a function that take in an integer and return true if its primeNumber
    @Test
    public void primeNumber(){
        Kata tobi = new Kata();
        boolean number1=tobi.primeNumber(29);
        assertEquals(true,number1);
    }

}