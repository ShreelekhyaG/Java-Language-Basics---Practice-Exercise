package main.Java;

import java.util.Scanner;

public class ReverseStringGenerator9 {
    public static void main(String[] args)
    {

    }
    public String revString(String str)
    {
        try
        {
            if( str == null )
                throw new NumberFormatException("The number cannot be null");
        }
        catch(NumberFormatException e)
        {
            return "Null exception";
        }
        String reverseString="";
        for(int index=str.length()-1;index>=0;index--)
            reverseString=reverseString+str.charAt(index);
        return reverseString;
    }
}
