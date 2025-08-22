package Sprint_02;

import java.util.Scanner;

public class Problem_41 {
    public static void main(String[] args) {


        Scanner kb=new Scanner(System.in);
        int rows;
        System.out.println("Enter no. of rows ");
        rows=kb.nextInt();


        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
