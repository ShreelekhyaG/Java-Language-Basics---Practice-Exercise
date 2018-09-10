import java.util.Scanner;

public class OddEven2 {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=scanner.nextInt();
        if(n%2 == 0 && n>=20 && n<=30)
            System.out.println("Jerry");
        if(n%2 != 0 && n>=20 && n<=30)
            System.out.println("Tom");
    }
}
