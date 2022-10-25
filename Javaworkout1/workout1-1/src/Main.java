// To convert the input temperature value in Fahrenheit to Celsius.
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        float Fahrenheit, Celsius;
        System.out.println("Enter Fahrenheit value :");
        Scanner input =new Scanner(System.in);
        Fahrenheit = input.nextFloat();
        Celsius = ((Fahrenheit-32)*5)/9 ;
        System.out.println("Celsius value is:\n"+ Celsius);

    }
}