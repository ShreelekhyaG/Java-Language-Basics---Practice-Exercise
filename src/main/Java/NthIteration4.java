package main.Java;

import java.util.Scanner;

public class NthIteration4 {
    public static void main(String args[])
    {
    }
    public String repeat(Integer n)
    {
        try
        {
            if( n == null)
                throw new NumberFormatException("The number cannot be null");
        }
        catch(NumberFormatException e)
        {
            return "Null exception";
        }
        String res="";
        for(int i=1;i<=n;i++)
            for(int j=1;j<=i;j++)
                res=res+i+" ";
        return res.trim();
    }
}
