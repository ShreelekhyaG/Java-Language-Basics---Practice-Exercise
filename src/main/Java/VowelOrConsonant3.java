package main.Java;

import java.util.Scanner;

public class VowelOrConsonant3 {
    public static void main(String args[])
    {


    }
    public String vowelCheck(String word)
    {
        try
        {
            if( word == null )
                throw new NumberFormatException("The number cannot be null");
        }
        catch(NumberFormatException e)
        {
            return "Null exception";
        }
        word=word.toLowerCase();
        String res="";
        for(int i=0;i<word.length();i++)
        {
            if((word.charAt(i)>=65 && word.charAt(i)<=90) || (word.charAt(i)>=97 && word.charAt(i)<=122))
            {
                if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u')
                {
                    res=res+ "Vowel ";
                }
                else
                    res=res+ "Consonant ";
            }
            else
                res=res+"Error! Not a letter ";

        }
        return res;
    }
}
