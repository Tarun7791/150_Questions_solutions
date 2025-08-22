package Sprint_02;
import java.util.Scanner;
public class Problem_24 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int start, end;
        System.out.println("Enter starting value ");
        start = kb.nextInt();
        System.out.println("Enter ending value ");
        end = kb.nextInt();

        for(int i=start;i<=end;i++){
            if(Ispalindrome(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean Ispalindrome(int num){
        int original=num;
        int reversed=0;

        while(num>0){
            int temp=num%10;
            reversed=(reversed*10)+temp; // remember to reverse a number.
            num=num/10;
        }

        return reversed==original;

    }
}

