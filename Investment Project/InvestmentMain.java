import java.util.*;

public class InvestmentMain
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double money, interest, goal;
        System.out.println ("Enter an amount of money to be in your account.");
        money = keyboard.nextDouble();
        System.out.println ("Enter an interest rate for your account.");
        interest = keyboard.nextDouble();
        Investment college = new Investment (money, interest);
        System.out.println ("What is your goal?");
        goal = keyboard.nextDouble();
        college.waitForBalance(goal);
        System.out.println ("It will take you " + college.getYears() + " years to reach your goal.");
    }
}