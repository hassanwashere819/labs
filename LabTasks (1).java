import java.util.Scanner;
public class L4{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting year");
        int start = input.nextInt();
        System.out.println("Enter ending year");
        int end = input.nextInt();
        if (start >= 1000 && start < end) {
            do {
                if(start % 4 == 0 ) {
                    System.out.println("Leap Year :" + start);
                    start++;
                } else {
                    start++;
                }
            }while( start < end) ;
        } else {
            System.out.println("Enter year greater than 1000");
        }
    }
}