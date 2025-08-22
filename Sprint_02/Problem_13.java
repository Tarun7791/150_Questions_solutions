package Sprint_02;
import java.util.Scanner;

public class Problem_13 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n;
        System.out.println("Enter the n number ");
        n = kb.nextInt();

        int num = 2;
        int sum = 0;
        int count = 0;

        while (count < n) {
            if (IsPrime(num)) {
                count++;
                sum = sum + num;
            }
            num++;
        }
        System.out.println(sum);
    }


    public static boolean IsPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}