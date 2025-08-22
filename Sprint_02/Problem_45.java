package Sprint_02;

import java.util.Scanner;

public class Problem_45 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int rows;
        System.out.println("Enter no. of rows ");
        rows=kb.nextInt();
        int columns;
        System.out.println("Enter no. of columns ");
        columns=kb.nextInt();

        int [][] arr=new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){

                arr[i][j]=(int)(Math.random()*10);

            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){

                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

    }
}
