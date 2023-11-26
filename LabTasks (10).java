import java.util.Scanner;
public class L3T4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Marks");
            double marks = input.nextDouble();
            sum = sum + marks;
        }
        double avg = sum / 3;
        if (avg >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
    }