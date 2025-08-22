package Sprint_02;
import java.util.Scanner;

public class Problem_08 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int a;
        System.out.println("Enter number 1");
        a=kb.nextInt();
        int b;
        System.out.println("Enter number 2");
        b=kb.nextInt();
        int c;
        System.out.println("Enter number 3");
        c=kb.nextInt();

        int gcd=calculateGcd(a,b,c);
        System.out.println("Gcd is "+gcd);

    }

    static int calculateGcd(int a,int b,int c){
        int temp=Math.min(a,b);
        int min=Math.min(temp,c);


        int gcd=0;
        for(int i=1;i<=min;i++){
            if(a%i==0&&b%i==0&&c%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}


