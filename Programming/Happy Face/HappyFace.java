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
        canvas.setColor (Color.pink);
        canvas.fillOval (100, 50, 200, 200);
        canvas.setColor (Color.black);
        canvas.fillOval (155, 100, 10, 20);
        canvas.setColor (Color.black);
        canvas.fillOval (230, 100, 10, 20);
        canvas.drawArc (150, 160, 100, 50, 180, 180);
        canvas.setColor (Color.blue);
        canvas.drawString ("By Eddie Mack", 150, 300);
        canvas.drawLine (100, 50, 300, 50);
        canvas.fillRect (150, 50, 100, 25);
        canvas.fillRect (150, 80, 25, 10);
        canvas.fillRect (220, 80, 25, 10);
    }
}