import java.util.Scanner;
public class L3T1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1= input.nextInt();
        int num2= input.nextInt();
        System.out.println("Add = " + (num1+num2));
        System.out.println("subtract = " + (num1-num2));
        System.out.println("Multiply = " + (num1*num2));
        System.out.println("Divide = " + (num1/num2));
        System.out.println("Remainder = " + (num1%num2));
    }
}