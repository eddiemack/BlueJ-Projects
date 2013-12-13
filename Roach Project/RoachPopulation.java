/**
 * Roach Project is a program where the number of roaches rises as the roaches breed (doubling their population), and you have the option to spray insecticide, which reduces the population by 10%.
 * 
 * @author Eddie Mack
 * @version 11/12/13
 */
public class RoachPopulation
{
    private double numRoaches;
    
    /**
     * Constructs the population of 10 roaches.
     * @param numRoaches The number of roaches.
     */
    public RoachPopulation (int amtRoaches)
    {
        numRoaches = amtRoaches;
    }
    
    /**
     * Spray the population of roaches with insecticide, reducing the population by 10%.
     */
    public void spray ()
    {
        numRoaches = numRoaches * .9;
    }
    
    /**
     * Breeds the population of roaches, doubling their population.
     */
    public void breed ()
    {
        numRoaches = numRoaches * 2;
    }
    
    /**
     * Tells the user the number of roaches left.
     * @return The population of roaches.
     */
    public int getRoaches ()
    {
        return ((int) numRoaches);
    }
}