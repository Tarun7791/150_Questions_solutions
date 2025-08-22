package Sprint_02;
import java.util.Scanner;

public class Problem_31 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int n;
        System.out.println("Enter nth number ");
        n=kb.nextInt();

        int sum=1;
        int a=0,b=1;
        System.out.print(b+" ");

        for(int i=1;i<n;i++){
            int c=a+b;
            System.out.print(c+" ");
            sum=sum+c;
            a=b;
            b=c;
        }


        System.out.println("Sum is "+sum);
    }
}
