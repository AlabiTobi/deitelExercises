package abstrations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    @Test
    public void addTest(){
        List list = new ArrayList<Number> ();
        list.add ("Boxers for boyfriend");
        assertEquals (1, list.size ());

    }
    @Test public void removeTest(){
        List list = new ArrayList<Number> ();
        list.add("String on a guitar");
        list.remove(0);
        assertEquals (0, list.size());
    }
    @Test public void addAndGetTest(){
        List list = new ArrayList<Number> ();
        list.add("String on a guitar");
        list.add("Protective gear");
        assertEquals ("Protective gear", list);
        assertEquals ("String on a guitar", list);
    }

}