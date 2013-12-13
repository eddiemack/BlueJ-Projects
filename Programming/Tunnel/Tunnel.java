/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import javax.swing.*;
import java.awt.*;
public class Tunnel extends JApplet
{
    public void paint (Graphics canvas)
    {
        int zInt;
        for (zInt = 0; zInt<= 640; zInt = zInt + 10)
        {
            canvas.drawOval (zInt, zInt, 50, 50);
        }
    }
}