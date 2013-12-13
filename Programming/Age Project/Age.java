/**
 * I have neither received nor given unauthorized aid on this assignment.
 * 
 * Acknowledgement:
 * Thanks to Edward Park for pointing out that I was missing "year(s)" in this assignment.
 * 
 * Eddie Mack
 */
import java.util.*;
public class Age
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int birthYear, yourAge, yearsBeforeDrivingTest, yearsBeforePg13, yearsBeforeVoting, yearsBeforeDrinking, yearsBeforePresident, yearsBeforeRentCar, yearsBeforeSenate, yearsBeforeSeniorDiscount;
        System.out.print ("What is your year of birth?");
        birthYear = keyboard.nextInt ();
        System.out.println ("Thanks!");
        yourAge = 2012 - birthYear;
        System.out.println ("You are " + yourAge + " years old");
        yearsBeforeDrivingTest = 16 - yourAge;
        System.out.println ("In " + yearsBeforeDrivingTest + " year(s) you are eligible to take a driving test in California.");
        yearsBeforePg13 = 13 - yourAge;
        System.out.println ("In " + yearsBeforePg13 + " year(s) you can watch a PG 13 movie.");
        yearsBeforeVoting = 18 - yourAge;
        System.out.println ("In " + yearsBeforeVoting + " year(s) you can vote.");
        yearsBeforeDrinking = 21 - yourAge;
        System.out.println ("In " + yearsBeforeDrinking + " year(s) you can legally drink.");
        yearsBeforePresident = 35 - yourAge;
        System.out.println ("In " + yearsBeforePresident + " year(s) you can run for president.");
        yearsBeforeRentCar = 25 - yourAge;
        System.out.println ("In " + yearsBeforeRentCar + " year(s) you can rent a car.");
        yearsBeforeSenate = 30 - yourAge;
        System.out.println ("In " + yearsBeforeSenate + " year(s) you can run for Senate.");
        yearsBeforeSeniorDiscount = 55 - yourAge;
        System.out.println ("In " + yearsBeforeSeniorDiscount + " year(s) you are eligible for a Senior Discount");
    }
}