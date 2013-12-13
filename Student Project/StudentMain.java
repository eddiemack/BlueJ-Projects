import java.util.*;

public class StudentMain
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String name;
        int quizScore, score;
        double getTotalScore, getAverageScore;
        System.out.println ("What is your name?");
        name = keyboard.next();
        Student sevvie = new Student (name);
        System.out.println ("Enter a quiz score.");
        quizScore = keyboard.nextInt();
        while (quizScore >= 0)
        {
            sevvie.addQuiz (quizScore);
            System.out.println ("Enter another quiz score.");
            quizScore = keyboard.nextInt();
        }
        System.out.println ("Your total quiz score is " + sevvie.getTotalScore() + ".");
        System.out.println ("Your average quiz score is " + sevvie.getAverageScore() + ".");
    }
}