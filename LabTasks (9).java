import java.util.Scanner;
public class L3T3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counteven=0,countodd=0,countzero=0;
        for(int i=0;i<10;i++) {
            System.out.println("Enter value");
            int choice = input.nextInt();
            if (choice == 0) {
                countzero++;
            } else if (choice % 2 != 0) {
                countodd++;
            } else {
                counteven++;
            }
        }
        System.out.println("Even : " + counteven);
        System.out.println("Odd : " + countodd);
        System.out.println("zero : " + countzero);
    }
}