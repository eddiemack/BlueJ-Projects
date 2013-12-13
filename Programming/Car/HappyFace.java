/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import javax.swing.*;
import java.awt.*;
public class HappyFace extends JApplet
{
    public void paint (Graphics canvas)
    {
        canvas.setColor (Color.orange);
        canvas.drawRect (100, 110, 60, 10);
        canvas.drawOval (110, 120, 10, 10);
        canvas.drawOval (140, 120, 10, 10);
        canvas.drawLine (110, 110, 120, 100);
        canvas.drawLine (120, 100, 140, 100);
        canvas.drawLine (140, 100, 150, 110);
    }
}