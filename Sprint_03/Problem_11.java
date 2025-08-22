package Patterns_Problems_B;

public class Problem_11 {
    public static void main(String[] args) {

        int n=4;
        int[][] arr=new int [n][n];

        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                if((i+j)%2==0){
                    arr[i][j]=0;
                }
                else{
                    arr[i][j]=1;
                }
            }
        }


        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
