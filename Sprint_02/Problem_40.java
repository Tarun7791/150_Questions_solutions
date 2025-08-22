package Sprint_02;
import java.util.Scanner;

public class Problem_40 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int n;
        System.out.println("Enter the nth number ");
        n=kb.nextInt();

        int sum=0;

        for(int i=2;i<=n;i++){
            if(i%2==0){
                int temp=i*i;
                sum=sum+temp;
            }
        }

        System.out.println("Sum of all sqaures of all even no. upto "+n+" Number is "+sum);

    }
}
