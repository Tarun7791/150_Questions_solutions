package Sprint_02;

import java.util.Scanner;

public class Problem_07 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int n;
        System.out.println("Enter the number ");
        n=kb.nextInt();


        int[][] arr=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=(i+1)*(j+1);
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }













    }
    }
