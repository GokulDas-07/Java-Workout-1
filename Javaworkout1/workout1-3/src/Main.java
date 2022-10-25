//  To generate Fibonacci series up to the given input number using recursion
import java.util.Scanner;
public class Main {
    public static int Fibonacci(int count)
    {
        if(count==0)
        {
            return 0;
        }
        else if(count==1)
        {
            return 1;
        }
        else
        {
            return Fibonacci(count-1) +Fibonacci(count-2);
        }

    }

    public static void main(String[] args)
    {
        System.out.println("Enter count for fibonacci series:");
        Scanner input =new Scanner(System.in);
        int count = input.nextInt();
        System.out.println("Fibonacci series is:");
        for (int i=0;i<count;i++)
        {
            System.out.print(Fibonacci(i)+" ");
        }
    }
}