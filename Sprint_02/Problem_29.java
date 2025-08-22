package Sprint_02;
import java.util.Scanner;

public class Problem_29{
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two digits ");
        a=kb.nextInt();
        b=kb.nextInt();

        int product=a*b;
        System.out.print("Product is "+product+" ");
        System.out.println("divisors are:"+" ");

        for(int i=1;i<=product;i++){
            if(product%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
