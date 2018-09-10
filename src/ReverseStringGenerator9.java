import java.util.Scanner;

public class ReverseStringGenerator9 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string :");
        String str=scanner.next();
        String reverseString="";
        for(int index=str.length()-1;index>=0;index--)
            reverseString=reverseString+str.charAt(index);
        System.out.println(reverseString);
    }
}
