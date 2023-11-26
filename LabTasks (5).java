import java.util.Scanner;
public class L2T4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Year: ");
        float Year = input.nextFloat();
        System.out.println("In months : " + Year*12);
        System.out.println("In Days : " + Year*365);
    }
}