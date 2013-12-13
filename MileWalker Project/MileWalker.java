import kareltherobot.*;
import java.awt.Color;


class MileWalker extends UrRobot
{
    public MileWalker (int s, int a, Direction d, int nOfB, Color c)
    {
        super (s, a, d, nOfB, c);
    }
    
    public void moveMile ()
    {
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
    }
    public void turnRight ()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void turnAround ()
    {
        turnLeft();
        turnLeft();
    }
    public void spin360 ()
    {
        turnAround();
        turnAround();
    }
    public void moveDiagonally ()
    {
        turnLeft();
        move();
        turnRight();
        move();
        turnLeft();
        move();
        turnRight();
    }
    public void moveRandomly ()
    {
        int n = (int) (Math.random()*4);
        if (n>=0)
        {
            moveMile();
        }
    }
}