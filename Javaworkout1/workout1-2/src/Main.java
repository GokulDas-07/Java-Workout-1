// Program to generate a Triangle
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter number of rows:");
        Scanner input =new Scanner(System.in);
        int rows= input.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}