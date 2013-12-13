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
        int y, x, numRect;
        for (numRect = 1; numRect<= 1000; numRect = numRect + 1)
        {
            x = (int) (Math.random () * 640);
            y = (int) (Math.random () * 640);
            canvas.drawRect (x, y, 5, 8);
        }
    }
}