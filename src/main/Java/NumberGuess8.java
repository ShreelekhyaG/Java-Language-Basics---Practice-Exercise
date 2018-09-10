package main.Java;

import java.util.Scanner;

public class NumberGuess8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 50:");
        int num = scanner.nextInt();
        int large = 50;
        while (num != large) {
            if(num<large)
                System.out.println("Number guessed is less than original number");
            else if(num>large)
                System.out.println("Number guessed is more than original number");
            System.out.println("Enter a number from 1 to 50:");
            num=scanner.nextInt();
        }
        System.out.println("Number guessed matches the original number");
    }
}
