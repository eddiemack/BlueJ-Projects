import java.util.*;

public class EarthquakeMain
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double magnitude;
        System.out.println ("What is the magnitude of your earthquake.");
        magnitude = keyboard.nextDouble();
        Earthquake marvin = new Earthquake (magnitude);
        System.out.println (marvin.getDescription());
    }
}