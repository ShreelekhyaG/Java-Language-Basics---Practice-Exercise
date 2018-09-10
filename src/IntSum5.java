import java.util.Scanner;

public class IntSum5 {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input:");
        String input=scanner.nextLine();
        String[] inputSplit=input.trim().split("\\s");
        int num,sum=0;
        for(int i=0;i<inputSplit.length;i++)
        {
            try{
                num=Integer.parseInt(inputSplit[i]);
                sum=sum+num;
            }
            catch (Exception ex) {
                System.out.println(ex.getMessage()+" is non-integer value");
            }
        }
        System.out.println(sum);
    }
}
