import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortedNum_7 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        Integer num=s.nextInt();
        Integer numa[],temp=num;int i=0,len=0,sum=0;
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
            System.out.print(numa[j]);
        System.out.println("\nSum of even numbers: "+sum);
        if(sum>15)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
