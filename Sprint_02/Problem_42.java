package Sprint_02;

import java.util.Scanner;

public class Problem_42 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int [][] arr=new int[3][3];
        int []arr1=new int[3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                System.out.println("Enter number for  "+i+" "+j);
                arr[i][j]=kb.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            int highest =arr[i][0];

            for(int j=0;j<3;j++){

                if(arr[i][j]>highest){
                    highest=arr[i][j];
                }

            }

            System.out.println("Largest element in row " + i + " is " + highest);
        }
    }
}
