import java.util.Scanner;

public class VowelOrConsonant3 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=s.next().toLowerCase();
        for(int i=0;i<word.length();i++)
        {
            if((word.charAt(i)>=65 && word.charAt(i)<=90) || (word.charAt(i)>=97 && word.charAt(i)<=122))
            {
                if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u')
                {
                    System.out.println("Vowel");
                }
                else
                    System.out.println("Consonant");
            }
            else
                System.out.println("Error! "+word.charAt(i)+"  is not a letter");
        }
    }
}
