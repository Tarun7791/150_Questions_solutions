package Patterns_Problems_B;
public class Problem_12 {
    public static void main(String[] args) {

        int rows=4;
        int [][] arr=new int[rows][rows];


        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    arr[i][j]=1;

                }
                else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
