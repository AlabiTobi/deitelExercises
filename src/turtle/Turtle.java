package turtle;

import static turtle.Direction.*;

public class Turtle {
    private Pen biro = new Pen();
    private Direction currentDirection = Direction.EAST;

    public boolean isPenUp(){
    return true;
}
    public boolean isPenDown(){
        return biro.isDown ();
    }

    public void penDown() {
        biro.penDown();
    }

    public void penUp () {
        biro.penUp();
    }

    public Direction getCurrentDirection () {
        return currentDirection;
    }

    public void turnRight () {

        if(currentDirection == EAST) currentDirection = SOUTH;
        else if(currentDirection == SOUTH) currentDirection = WEST;
        else if(currentDirection == WEST) currentDirection = NORTH;
        else if(currentDirection == NORTH) currentDirection = SOUTH;
    }
    public void turnLeft () {
        if(currentDirection == EAST) currentDirection = NORTH;
        else if(currentDirection == NORTH) currentDirection = WEST;
        else if(currentDirection == WEST) currentDirection = SOUTH;
        else if(currentDirection == SOUTH) currentDirection = EAST;

    }
    }

