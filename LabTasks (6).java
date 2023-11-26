import java.util.Scanner;
public class L2T5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius: ");
        double temp = input.nextDouble();
        System.out.println("Fahrenheit = " + (temp*1.8+32));
    }
}