import kareltherobot.*;
import java.awt.Color;

class StairSweeper extends UrRobot
{
    public StairSweeper (int s, int a, Direction d, int n, Color c)
    {
        super (s, a, d, n, c);
    }
        public void turnRight ()
        {
            turnLeft ();
            turnLeft ();
            turnLeft ();
        }
        public void climbStair ()
        {
            turnLeft ();
            move ();
            turnRight();
            move ();
        }
    
    
}