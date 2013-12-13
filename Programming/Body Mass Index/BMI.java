/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgments: Thanks to Cameron Stine for helping me with the end.
 * Eddie Mack
 */
import java.util.*;
public class BMI
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double meters, kilograms, bmi, pounds, weight, feet, inches, foot, inch;
        String name;
        System.out.println ("This BMI Calculator may overestimate fat in muscular individuals and underestimate body fat in older people. It also does not factor in your age. If you have questions about your health, TOO BAD!!!");
        System.out.println ("What's your first name?");
        name = keyboard.next ();
        System.out.println (name + ", how much do you weigh in pounds?");
        pounds = keyboard.nextDouble ();
        System.out.println (name + ", how tall are you...");
        System.out.println ("in feet?");
        feet = keyboard.nextDouble ();
        System.out.println ("and inches?");
        inches = keyboard.nextDouble ();
        foot = (feet * 12) + inches;
        inch = foot;
        kilograms = pounds * 0.454;
        meters = inch * 0.0254;
        bmi = kilograms / (meters * meters);
        System.out.println ("BMI = " + bmi);
        if (bmi< 18.5)
        {
            System.out.println ("You be underweight.");
        }
        else if (bmi< 24.9)
        {
            System.out.println ("You be normal.");
        }
        else if (bmi< 29.9)
        {
            System.out.println ("You be overweight.");
        }
        else if (bmi> 30.0)
        {
            System.out.println ("You be obese. Go consult a physician.");
        }
    }
}