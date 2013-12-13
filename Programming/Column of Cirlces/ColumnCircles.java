/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import javax.swing.*;
import java.awt.*;
public class ColumnCircles extends JApplet
{
    public void paint (Graphics canvas)
    {
        int yInt;
        for (yInt = 0; yInt<= 600; yInt = yInt + 60)
        {
            canvas.drawOval (0, yInt, 50, 50);
        }
    }
}