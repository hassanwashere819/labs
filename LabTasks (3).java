import java.util.Scanner;
public class L2T2{
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius of Circle:");
        double radius= input.nextDouble();
        double area = 3.14*radius;
        System.out.println("Area is:" + area);
        }
}