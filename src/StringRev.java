import java.util.Scanner;

public class StringRev {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a string :");
        String str=s.next();String rev="";
        for(int index=str.length()-1;index>=0;index--)
            rev=rev+str.charAt(index);
        System.out.println(rev);
    }
}
