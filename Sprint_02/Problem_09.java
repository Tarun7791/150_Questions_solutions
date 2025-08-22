package Sprint_02;
import java.util.Scanner;

public class Problem_09 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int limit;
        System.out.println("Enter the limit ");
        limit = kb.nextInt();


        int sum = 0;
        int odd = 1;

        for (int i = 1; i <= limit; i++) {
            System.out.println("Odd is " + odd);
            sum = sum + odd;
            odd = odd + 2;
        }

        System.out.println("Sum of first odd numbers are " + sum);
    }
}
