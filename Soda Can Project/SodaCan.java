
/**
 * Soda Can allows the user to create a soda can and find the diameter and surface area of the can after entering the height and diameter of the can.
 * @author Eddie Mack
 * @version 11/18/2013
 */
public class SodaCan
{
    private double canHeight;
    private double canDiameter;
    private double radius;
    /**
     * Constructs the can.
     * @param height The height of the can
     * @param diameter The diameter of the can.
     */
    public SodaCan (double height, double diameter)
    {
        canHeight = height;
        canDiameter = diameter;
        radius = diameter  / 2;
    }
    
    /**
     * The volume of the can.
     */
    public double getVolume ()
    {
        return (Math.PI * (radius * radius) * canHeight);
    }
    
    /**
     * The surface area of the can.
     */
    public double getSurfaceArea ()
    {
        return ((2 * Math.PI) * (radius * radius) + (2 * Math.PI) * radius * canHeight);
    }
}