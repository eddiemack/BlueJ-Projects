import java.util.*;

public class PalindromeMain
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String word;
        System.out.println ("Enter a word.");
        word = keyboard.next();
        Palindrome userWord = new Palindrome (word);
        System.out.println ("The reverse of " + word + " is " + userWord.reverse() + ".");
        System.out.println ("Your word is a palindrome: " + userWord.isPalindrome() + ".");
    }
}