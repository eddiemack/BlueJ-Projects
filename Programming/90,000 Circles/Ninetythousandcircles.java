/**
 * I have neither given nor received unauthorized aid on this assignment.\
 * Acknowledgements: Edward Park
 * Eddie Mack
 */
import javax.swing.*;
import java.awt.*;
public class Ninetythousandcircles extends JApplet
{
    public void paint (Graphics canvas)
    {
        int counter, xInt, yInt, color;
        for (counter = 1; counter<= 90000; counter = counter + 1)
        {
            color = (int) (Math.random () * 3);
            if (color == 1)
            {
                canvas.setColor (Color.blue);
            }
            else if (color == 2)
            {
                canvas.setColor (Color.red);
            }
            else
            {
                canvas.setColor (Color.green);
            }
            xInt = (int) (Math.random () * 641);
            yInt = (int) (Math.random () * 481);
            canvas.drawOval (xInt, yInt, 1, 1);
        }
    }
}