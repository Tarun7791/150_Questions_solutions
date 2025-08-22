package Sprint_02;

import java.util.Scanner;

public class Problem_22 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int num;
        System.out.println("Enter the number ");
        num=kb.nextInt();

        int [][] arr=new int [num][num];


        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){

                if(j==0||j==i){
                    arr[i][j]=1;
                }
                else {
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                }
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
