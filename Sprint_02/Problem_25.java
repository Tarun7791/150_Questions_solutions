package Sprint_02;

import java.util.Scanner;

public class Problem_25 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int n;
        System.out.println("Enter no. of rows ");
        n=kb.nextInt();

        int [][] arr=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=(i+j)%2;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
