import kareltherobot.*;
import java.awt.Color;

public class AreaMeasurer extends Robot
{
    private int length;
    private int width;
    public AreaMeasurer (int s, int a, Direction d, int n, Color c)
    {
        super (s, a, d, n, c);
        length = 0;
        width = 0;
    }
    
    public void measureArea ()
    {
        while (frontIsClear())
        {
            move();
            length = length + 1;
        }
        turnLeft();
        while (frontIsClear())
        {
            move();
            width = width + 1;
        }
        putAreaBeeper();
        turnLeft();
        move();
    }

    public void turnRight ()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void putAreaBeeper ()
    {
        for (int counter = 1; counter <= (length * width); counter = counter + 1)
        {
            putBeeper();
        }
    }
}