package main.Java;

import java.util.Scanner;

public class CharDisplay6 {
    public static void main(String[] args)
    {
    }
    public String charType(String input)
    {
        try
        {
            if( input == null )
                throw new NumberFormatException("The number cannot be null");
        }
        catch(NumberFormatException e)
        {
            return "Null exception";
        }
        char character=input.charAt(0);
        if(character>=65 && character<=90)
           return "Capital letter";
        else if (character>=97 && character<=122)
            return "Small case letter";
        else if (character>=48 && character<=57)
            return "Digit";
        else
            return "Special character";
    }
}
