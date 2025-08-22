package Sprint_02;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int num;
        System.out.println("Enter the number ");
        num=kb.nextInt();



        while(num>=10){
            int sum=0;
            while(num!=0){
                int temp=num%10;
                sum=sum+temp;
                num=num/10;
            }
            num=sum;
        }

        System.out.println(num );










    }
}
