package Sprint_02;

import java.util.Scanner;

public class Problem_50 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int rows;
        System.out.println("Enter no. of rows ");
        rows=kb.nextInt();



        for(int i=1;i<=rows;i++){
            for(int space=rows;space>i;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
