/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import javax.swing.*;
import java.awt.*;
public class Snowman extends JApplet
{
    public void paint (Graphics canvas)
    {
        canvas.setColor (Color.cyan);
        canvas.fillOval (110, 90, 100, 100);
        canvas.fillOval (75, 150, 175, 175);
        canvas.fillOval (70, 300, 200, 200);
    }
}