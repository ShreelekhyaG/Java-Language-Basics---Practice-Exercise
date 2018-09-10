package main.Java;

import java.util.Scanner;


public class Palindrome1 {
    public static void main(String args[])
    {

    }
    public String palindromeCheck(Long num)
    {
        try
        {
            if( num == null )
                throw new NumberFormatException("The number cannot be null");
        }
        catch(NumberFormatException e)
        {
            return "Null exception";
        }
        Long rev= Long.valueOf(0),sum= Long.valueOf(0),temp,anum=num;
        while(num>0)
        {
            temp= (num%10);
            if(temp%2==0)
                sum=sum+temp;
            rev=(rev*10)+temp;
            num=num/10;
        }
        if(rev.equals(anum))
        {
            if(sum>Long.valueOf(25))
                return "It is palindrome and the sum of even numbers is greater than 25";
            else
                return "It is palindrome and the sum of even numbers is less than 25";
        }
        else
            return "It is not a palindrome";

    }
}
