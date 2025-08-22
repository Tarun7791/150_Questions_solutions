package Sprint_02;
import java.util.Scanner;

public class Problem_23 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers ");
        a=kb.nextInt();
        b=kb.nextInt();

        int product=a*b;
        int sum=0;

        while(product!=0){
            int temp=product%10;
            sum=sum+temp;
            product=product/10;
        }
        System.out.println("Sum of the digits of products are "+sum);
    }
}
