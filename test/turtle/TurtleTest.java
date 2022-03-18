package turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TurtleTest {
    private Turtle ijapa;

    @BeforeEach
    public void setup () {
        ijapa = new Turtle ();
    }

    @Test
    public void turtleExistedTest () {
        assertNotNull (ijapa);
    }

    @Test
    public void turtlePenIsUpByDefault () {
        boolean isPenDown = ijapa.isPenDown ();
        assertFalse (isPenDown);
    }

    @Test
    public void turtleCanMovePenDownTest () {
        assertFalse (ijapa.isPenDown ());
        ijapa.penDown ();
        boolean isPenDown = ijapa.isPenDown ();
        assertTrue (isPenDown);
    }

    @Test
    public void turtleMovePenUpTest () {
        ijapa.penDown ();
        ijapa.penUp ();
        assertFalse (ijapa.isPenDown ());
    }

    @Test
    public void turtleFacesEastByDefaultTest () {
        assertEquals (Direction.EAST, ijapa.getCurrentDirection ());
    }

    @Test
    public void turtleCanTurnRightFromEastTest () {
        ijapa.turnRight ();
        assertSame (Direction.SOUTH, ijapa.getCurrentDirection ());
    }

    @Test
    public void turtleCanTurnRightFromSouthTest () {
        ijapa.turnRight ();
        ijapa.turnRight ();
        assertSame (Direction.WEST, ijapa.getCurrentDirection ());
    }

    @Test
    public void turtleCanTurnRightFromWestTest () {
        ijapa.turnRight ();
        ijapa.turnRight ();
        ijapa.turnRight ();
        assertSame (Direction.NORTH, ijapa.getCurrentDirection ());
    }

    @Test
    public void turtleCanTurnRightFromNorthTest () {
        ijapa.turnRight ();
        ijapa.turnRight ();
        ijapa.turnRight ();
        ijapa.turnRight ();
        assertSame (Direction.SOUTH, ijapa.getCurrentDirection ());
    }

    @Test
    public void turtleCanTurnLeftFromEastTest () {
        ijapa.turnLeft ();
        assertSame (Direction.NORTH, ijapa.getCurrentDirection ());
    }

    @Test
    public void turtleCanTurnLeftFromNorthTest () {
        ijapa.turnLeft ();
        ijapa.turnLeft ();
        assertSame (Direction.WEST, ijapa.getCurrentDirection ());
    }

    @Test public void turtleCanTurnLeftFromWestTest () {
        ijapa.turnLeft ();
        ijapa.turnLeft ();
        ijapa.turnLeft ();
        assertSame (Direction.SOUTH, ijapa.getCurrentDirection ());
    }
    @Test public void turtleCanTurnLeftFromSouthTest(){
        ijapa.turnLeft ();
        ijapa.turnLeft ();
        ijapa.turnLeft ();
        ijapa.turnLeft ();
        assertSame (Direction.EAST, ijapa.getCurrentDirection ());
    }
}