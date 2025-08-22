package Sprint_02;
import java.util.Scanner;

public class Problem_11 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int num;
        System.out.println("Enter the number ");
        num=kb.nextInt();

        int LargestPrime=1;

        for(int i=2;i<=num;i++){
            if(num%i==0&& isprime(i)){
                LargestPrime=i;
            }
        }
        System.out.println("Largest prime factor "+LargestPrime);
    }

    public static boolean isprime(int n){
        if(n<2) return false;
        for(int i=2;i<n/2;i++) {
            if (n % i == 0) {
                return false;
            }
        }
            return true;
    }
}
