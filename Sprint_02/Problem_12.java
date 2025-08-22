package Sprint_02;

import java.util.Scanner;

public class Problem_12 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int row,column;
        System.out.println("Enter no. of rows ");
        row=kb.nextInt();
        System.out.println("Enter no. of columns ");
        column=kb.nextInt();

        int[][] arr=new int[row][column];
        int a=1,b=1,c;

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=a;
                c=a+b;
                a=b;
                b=c;
            }
        }

        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
