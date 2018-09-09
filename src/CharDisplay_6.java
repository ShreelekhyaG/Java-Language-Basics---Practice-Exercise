import java.util.Scanner;

public class CharDisplay_6 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a character :");
        char ch=s.next().charAt(0);
        if(ch>=65 && ch<=90)
            System.out.println("Capital letter");
        else if (ch>=97 && ch<=122)
            System.out.println("Small case letter");
        else if (ch>=48 && ch<=57)
            System.out.println("Digit");
        else
            System.out.println("Special character");
    }
}
