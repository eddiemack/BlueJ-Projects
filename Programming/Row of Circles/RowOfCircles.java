/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import javax.swing.*;
import java.awt.*;
public class RowOfCircles extends JApplet
{
    public void paint (Graphics canvas)
    {
        int xInt;
        for (xInt = 0; xInt<= 600; xInt = xInt + 60)
        {
            canvas.drawOval (xInt, 0, 50, 50);
        }
    }
}