package main.Java;

import java.util.Scanner;

public class NCharRepeat10 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input string:");
        String str=scanner.next();
        System.out.println("Input integer:");
        int repeatTimes=scanner.nextInt();

    }
    public String charRepeat(String str,int repeatTimes)
    {
        String lastChar="",resStr=str;
        int len=str.length();
        lastChar=str.substring(len-repeatTimes);
        System.out.println(lastChar);
        while(repeatTimes!=0)
        {
            resStr=resStr+lastChar;
            repeatTimes--;
        }
        return resStr;
    }
}
