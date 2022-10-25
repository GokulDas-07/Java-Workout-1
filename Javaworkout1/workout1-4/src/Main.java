//To check whether the given input string is Palindrome or not
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String str1,rev="";
        System.out.println("Enter the string");
        Scanner input = new Scanner(System.in);
        str1 = input.nextLine();
        for (int i=str1.length()-1;i>=0;i--)
        {
            rev=rev+str1.charAt(i);
        }
        if (rev.equals(str1))
        {
            System.out.println("Is pallindrome");
        }
        else
        {
            System.out.println("Not pallindrome");
        }
    }
}