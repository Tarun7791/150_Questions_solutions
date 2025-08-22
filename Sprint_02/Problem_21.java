package Sprint_02;

import java.util.Scanner;

public class Problem_21 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);

        int a,b;
        System.out.println("Enter first no. ");
        a=kb.nextInt();
        System.out.println("Enter second no. ");
        b=kb.nextInt();

        int c=a*b;
        int sum=0;

        while(c!=0){
            int temp=c%10;
            sum=sum+temp;
            c=c/10;
        }

        System.out.println("The sum is "+sum);











    }
}
