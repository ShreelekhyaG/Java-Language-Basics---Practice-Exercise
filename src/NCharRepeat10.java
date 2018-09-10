import java.util.Scanner;

public class NCharRepeat10 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input string:");
        String str=scanner.next();
        System.out.println("Input integer:");
        int repeatTimes=scanner.nextInt();
        String lastChar="",resStr=str;
        int len=str.length();
        lastChar=str.substring(len-repeatTimes);
        System.out.println(lastChar);
        while(repeatTimes!=0)
        {
            resStr=resStr+lastChar;
            repeatTimes--;
        }
        System.out.println(resStr);
    }
}
