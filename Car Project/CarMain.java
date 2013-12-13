import java.util.*;

public class CarMain
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double fuelEfficiency;
        double gallonsOfGas;
        double milesDriven;
        System.out.println ("What is the fuel efficiency of your car?");
        fuelEfficiency = keyboard.nextDouble();
        Car fiesta = new Car (fuelEfficiency);
        System.out.println ("How much gas do you want to add to your car?");
        gallonsOfGas = keyboard.nextDouble();
        fiesta.addGas(gallonsOfGas);
        System.out.println ("How many miles do you want to drive?");
        milesDriven = keyboard.nextDouble();
        fiesta.drive(milesDriven);
        gallonsOfGas = gallonsOfGas - (milesDriven / fuelEfficiency);
        System.out.println ("You have " + gallonsOfGas + " gallons of gas left.");
    }
}