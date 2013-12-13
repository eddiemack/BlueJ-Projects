/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import javax.swing.*;
import java.awt.*;
public class RandomRects extends JApplet
{
    public void paint (Graphics canvas)
    {
        int y, x, numRect, color;
        for (numRect = 1; numRect<= 1000; numRect = numRect + 1)
        {
            color = (int) (Math.random () * 4) + 1;
            if (color == 1)
            {
                canvas.setColor (Color.blue);
            }
            else if (color == 2)
            {
                canvas.setColor (Color.red);
            }
            else if (color == 3)
            {
                canvas.setColor (Color.green);
            }
            else
            {
                canvas.setColor (Color.black);
            }
            x = (int) (Math.random () * 640);
            y = (int) (Math.random () * 640);
            canvas.drawRect (x, y, 5, 8);
        }
    }
}