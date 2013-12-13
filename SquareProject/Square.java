
/**
 * The user will input the length of the sides of a square, then Square will compute the area, perimeter, and the diagonal of the square.
 * @author Eddie Mack
 * @version 11/18/2013
 */
public class Square
{
    private double side;
    /**
     * Constructs the square.
     * @param length The length of one side of the square.
     */
    public Square (double length)
    {
        side = length;
    }
    
    /**
     * The perimeter of the square.
     * @return The perimeter of the square.
     */
    public double getPerimeter ()
    {
        return (side * 4);
    }
    
    /**
     * The area of the square.
     * @return The area of the square.
     */
    public double getArea ()
    {
        return (side * side);
    }
    
    /**
     * The length of the diagonal of the square.
     * @return The length of the diagonal of the square.
     */
    public double getDiagonal ()
    {
        return (Math.sqrt ((side * side) * (side * side)));
    }
}