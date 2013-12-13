/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements: Edward Park
 * Eddie Mack
 */
import javax.swing.*;
import java.awt.*;
public class Sierpinski extends JApplet
{
    public void paint (Graphics canvas)
    {
        int counter;
        canvas.setColor (Color.red);
        canvas.drawOval (320, 0, 5, 5);
        canvas.setColor (Color.green);
        canvas.drawOval (0, 480, 5, 5);
        canvas.setColor (Color.blue);
        canvas.drawOval (640, 480, 5, 5);
        int seedX, seedY;
        seedX = (int) (Math.random () * 641);
        seedY = (int) (Math.random () * 481);
        canvas.drawOval (seedX, seedY, 1, 1);
        for (counter = 0; counter <= 90000; counter = counter + 1)
        {
            int  mdptX, mdptY, chance;
            chance = (int) (Math.random () * 3) + 1;
            if (chance == 1)
            {
                mdptX = (320 + seedX) / 2;
                mdptY = (0 + seedY) / 2;
            }
            else if (chance == 2)
            {
                mdptX = (640 + seedX) / 2;
                mdptY = (480 + seedY) / 2;
            }
            else
            {
                mdptX = (0 + seedX) / 2;
                mdptY = (480 + seedY) / 2;
            }
            canvas.fillOval (mdptX,mdptY , 1, 1);
            seedX = mdptX;
            seedY = mdptY;
        }
    }
}