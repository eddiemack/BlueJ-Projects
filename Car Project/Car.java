/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Eddie Mack
 * Acknowledgements:
 * 
 * @author Eddie Mack
 * @version 11/4/13
 */
public class Car
{
    private double mpg;
    private double gasLevel;
    
    /**
     * Constructs the car.
     * @param fuelEfficiency Gives the MPG
     */
    public Car (double fuelEfficiency)
    {
        mpg = fuelEfficiency;
        gasLevel = 0;
    }
    /**
     * Adds gas to the car
     * @param gasLeft Amount of gas left in car
     */
    public void addGas (double amountGas)
    {
        gasLevel = amountGas + gasLevel;
    }
    
    /**
     * Drives the car however many miles the user wants, as you drive, it reduces the amount of gas in the gas tank
     * @param miles # of miles the car will drive
     */
    public void drive (double miles)
    {
        gasLevel = gasLevel - (miles / mpg);
    }
    
    /**
     * Shows how much gas is left in the car
     * @return how much gas is left in the tank
     */
    public double getGasInTank ()
    {
        return (gasLevel);
    }
}