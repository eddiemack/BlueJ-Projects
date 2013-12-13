/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowlegements:
 * Eddie Mack
 */
import javax.swing.*;
import java.awt.*;
public class RandomColors extends JApplet
{
    public void paint (Graphics canvas)
    {
        int x, y, color;
        for (color = 1; color<= 4; color = color + (int) (Math.random () * 4))
        {
            
            canvas.drawOval (2, 2, 
    }
}