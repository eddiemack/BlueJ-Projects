public class CarTester
{
    public static void main (String [] args)
    {
        Car challenger = new Car (15);
        challenger.addGas (30);
        challenger.drive (15);
        System.out.println (challenger.getGasInTank());
    }
}