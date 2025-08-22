package Sprint_02;

import java.util.Scanner;

public class Problem_38 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int rows;
        System.out.println("Enter no. of rows ");
        rows=kb.nextInt();

        int []arr=new int[rows];
        int count=0;
        int num=2;

        while(count<rows){

            boolean isPrime=true;

            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;

                }
            }

            if(isPrime){
                arr[count]=num;
                count++;
            }
            num++;
        }
        for(int i=0;i<rows;i++){
            for (int j=0;j<=i;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
