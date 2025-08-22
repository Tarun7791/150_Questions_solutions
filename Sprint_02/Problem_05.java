package Sprint_02;

import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int num;
        System.out.println("Enter the number ");
        num=kb.nextInt();

        int mid=(num+1)/2;


        for(int i=1;i<=mid;i++){
            for(int space=1;space<=num-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int k=mid-1;k>=1;k--){
            for(int space1=1;space1<=num-k;space1++){
                System.out.print(" ");
            }
            for(int l=1;l<=2*k-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
