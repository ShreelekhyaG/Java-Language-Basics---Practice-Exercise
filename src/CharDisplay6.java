import java.util.Scanner;

public class CharDisplay6 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a character :");
        char character=scanner.next().charAt(0);
        if(character>=65 && character<=90)
            System.out.println("Capital letter");
        else if (character>=97 && character<=122)
            System.out.println("Small case letter");
        else if (character>=48 && character<=57)
            System.out.println("Digit");
        else
            System.out.println("Special character");
    }
}
