package main.Java;

import java.util.Scanner;

public class IntSum5 {
    public static void main(String args[])
    {
    }
    public String SumOfInt(String input)
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
        String[] inputSplit=input.trim().split("\\s");
        int num,sum=0;
        for(int i=0;i<inputSplit.length;i++)
        {
            try{
                num=Integer.parseInt(inputSplit[i]);
                sum=sum+num;
            }
            catch (Exception ex) {
                return "It is a non integer value";
            }
        }
        return String.valueOf(sum);
    }
}
