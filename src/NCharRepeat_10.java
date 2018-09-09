import java.util.Scanner;

public class NCharRepeat_10 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Input string:");
        String str=s.next();
        System.out.println("Input integer:");
        int n=s.nextInt();
        String last_n_char="",res_str=str;
        int len=str.length();
        last_n_char=str.substring(len-n);
        System.out.println(last_n_char);
        while(n!=0)
        {
            res_str=res_str+last_n_char;
            n--;
        }
        System.out.println(res_str);
    }
}
