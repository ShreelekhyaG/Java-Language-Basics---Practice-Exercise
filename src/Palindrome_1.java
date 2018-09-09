import java.util.Scanner;


public class Palindrome_1 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        long num=s.nextLong();
        long rev=0,sum=0,n;long anum=num;
        while(num>0)
        {
            n= (num%10);
            if(n%2==0)
                sum=sum+n;
            rev=(rev*10)+n;
            num=num/10;
        }
        if(rev==anum)
        {
            if(sum>25)
                System.out.println(anum+" is palindrome and the sum of even numbers is greater than 25 ");
            else
                System.out.println(anum+" is palindrome and the sum of even numbers is less than 25");
        }
        else
            System.out.println(anum+" is not a palindrome");
    }
}
