package main.Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortedNum7 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        Integer num=s.nextInt();

    }
    public int sortedNum(Integer num)
    {
        Integer numa[],temp=num;int i=0,len=0,sum=0;
        String result="";
        while(num != 0)
        {
            num /= 10;
            ++len;
        }
        num=temp;
        numa=new Integer[len];
        while(num!=0)
        {
            numa[i]=num%10;
            if(numa[i]%2==0)
                sum=sum+numa[i];
            num=num/10;
            i++;
        }
        Arrays.sort(numa, Collections.reverseOrder());
        System.out.print("Sorted number in non-increasing order: ");
        for(int j=0;j<numa.length;j++)
            result=result+numa[j];
        return Integer.parseInt(result);
    }
    public int sumOfEven(Integer num)
    {
        Integer numa[],temp=num;int i=0,len=0,sum=0;
        String result="";
        while(num != 0)
        {
            num /= 10;
            ++len;
        }
        num=temp;
        numa=new Integer[len];
        while(num!=0)
        {
            numa[i]=num%10;
            if(numa[i]%2==0)
                sum=sum+numa[i];
            num=num/10;
            i++;
        }
        return sum;
    }
    public boolean sumExceed(Integer sum)
    {
        if(sum>15)
            return true;
        else
            return false;
    }
}
