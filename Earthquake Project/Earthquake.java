
/**
 * In Earthquake, the user inputs a magnitude and then Earthquake outputs the description of the earthquake based on the description.
 * 
 * @author Eddie Mack
 * @version 11/22/13
 */
public class Earthquake
{
    public double magnitude;
    /**
     * Constructs an earthquake.
     * @param magnitude The magnitude of the earthquake.
     */
    public Earthquake (double mag)
    {
       magnitude = mag;
    }
    
    /**
     * Gets the effects of the earthquake.
     * @return The effects of the earthquake
     */
    public String getDescription ()
    {
        if (magnitude <= 1.9)
        {
            return ("This earthquake is a micro earthquake, so it will not be felt.");
        }
        else if (magnitude <= 2.9)
        {
            return ("This earthquake is a very minor earthquake, so it's generally not felt.");
        }
        else if (magnitude <= 3.9)
        {
            return ("This earthquake is a minor earthquake, so it will most likely be felt, but will most likely not cause damage.");
        }
        else if (magnitude <= 4.9)
        {
            return ("This earthquake is a light earthquake, so indoor items will shake, rattling noises will occur, but significant damage is unlikely.");
        }
        else if (magnitude <= 5.9)
        {
            return ("This earthquake is a moderate earthquake, so there will most likely be major damage to poorly constructed buildings, at most slight damage to well-constructed buildings.");
        }
        else if (magnitude <= 6.9)
        {
            return ("This earthquake is a strong earthquake, so there can be destructive in areas up to 100 miles across in populated areas.");
        }
        else if (magnitude <= 7.9)
        {
            return ("This earthquake is a major earthquake, so it can cause serious damage over large areas.");
        }
        else if (magnitude <= 8.9)
        {
            return ("This earthquake is a great earthquake, so it can cause serious damage over several hundred miles.");
        }
        else if (magnitude <= 9.9)
        {
            return ("This earthquake is a rarely-great earthquake, so it can be devastating in areas several thousand miles across.");
        }
        else
        {
            return ("This earthquake is a meteoric earthquake, so it has never been recorded, and you better run.");
        }
    }
}