// To find whether the given character is vowel or consonant using switch control
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter the character:");
        Scanner input = new Scanner(System.in);
        char chara = input.next().charAt(0);
        switch (chara){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Character is vowel");
                break;
            default:
                System.out.println("Character is consonant");
        }
    }
}