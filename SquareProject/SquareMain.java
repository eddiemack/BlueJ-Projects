import java.util.*;

public class SquareMain
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double length;
        System.out.println ("What is the length of the sides of your square?");
        length = keyboard.nextDouble();
        Square sponge = new Square (length);
        System.out.println ("The area of your square is " + sponge.getArea() + ".");
        System.out.println ("The perimeter of your square is " + sponge.getPerimeter() + ".");
        System.out.println ("The diagonal of your square is " + sponge.getDiagonal() + ".");
    }
}