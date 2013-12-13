/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
public class Palindrome
{
    private String wrd;
    
    public Palindrome (String word)
    {
        wrd = word;
    }
    
    public String reverse()
    {
        String temp = "";
        for (int index = wrd.length() - 1; index >= 0; index--)
        {
            temp = temp + wrd.charAt(index);
        }
        return (temp);
    }
    
    public boolean isPalindrome()
    {
        if (reverse().equals (wrd))
        {
            return (true);
        }
        else
        {
            return (false);
        }
    }
}