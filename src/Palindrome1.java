import java.util.Scanner;


public class Palindrome1 {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        long num=scanner.nextLong();
        long rev=0,sum=0,temp;
        long anum=num;
        while(num>0)
        {
            temp= (num%10);
            if(temp%2==0)
                sum=sum+temp;
            rev=(rev*10)+temp;
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
