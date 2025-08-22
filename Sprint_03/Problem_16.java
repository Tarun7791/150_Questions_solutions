package Patterns_Problems_B;

public class Problem_16 {
    public static void main(String[] args) {

        int rows=4;
        int columns=6;

        int[][] arr=new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if((i+j)%2==0){
                    arr[i][j]='X';
                }
                else{
                    arr[i][j]='O';
                }
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){

                System.out.print((char)arr[i][j]+" ");

            }
            System.out.println(" ");
        }

    }
}
