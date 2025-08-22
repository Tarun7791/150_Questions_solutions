package Sprint_02;
import java.util.Scanner;

public class Problem_20 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);

        int [][] arr=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter number for "+i+" "+j);
                int a=kb.nextInt();
                arr[i][j]=a;
            }
        }


        System.out.println("Your matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        int sum=0;
        for(int i=0;i<=2;i++){
            sum=sum+arr[i][i];
        }

        System.out.println("Your sum is "+sum);
    }

}
