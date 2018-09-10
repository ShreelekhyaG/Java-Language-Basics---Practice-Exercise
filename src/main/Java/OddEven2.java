package main.Java;

import java.util.Scanner;

public class OddEven2 {
    public static void main(String args[])
    {
    }
    public String oddEvenChecker(Integer number)
    {
        try
        {
            if( number == null)
                throw new NumberFormatException("The number cannot be null");
        }
        catch(NumberFormatException e)
        {
            return "Null exception";
        }
        if(number%2 == 0 && number>=20 && number<=30)
            return "Jerry";
        if(number%2 != 0 && number>=20 && number<=30)
            return "Tom";
        return "Out of range";
    }
}
