import java.util.Scanner;

public class NumberGuess_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 50:");
        int num = s.nextInt();
        int larg = 50;
        while (num != larg) {
            if(num<larg)
                System.out.println("Number guessed is less than original number");
            else if(num>larg)
                System.out.println("Number guessed is more than original number");
            System.out.println("Enter a number from 1 to 50:");
            num=s.nextInt();
        }
        System.out.println("Number guessed matches the original number");
    }
}
