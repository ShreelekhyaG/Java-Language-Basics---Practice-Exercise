import java.util.Scanner;

public class TomnJerry {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=s.nextInt();
        if(n%2 == 0 && n>=20 && n<=30)
            System.out.println("Jerry");
        if(n%2 != 0 && n>=20 && n<=30)
            System.out.println("Tom");
    }
}
