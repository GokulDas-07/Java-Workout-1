//To display all the perfect square numbers between two input numbers interval
import java.util.Scanner;
public class Main {

    public static void perfectSquare(int num1,int num2)
    {
        System.out.println("Perfect square numbers between "+num1+" and "+num2+" are:");
        for(int i=num1;i<=num2;i++)
        {
            if(Math.sqrt(i)==(int)Math.sqrt(i))
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args)
    {
        int num1,num2;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter starting number:");
        num1 = input.nextInt();
        System.out.println("Enter ending number:");
        num2 = input.nextInt();
        perfectSquare(num1,num2);
    }
}