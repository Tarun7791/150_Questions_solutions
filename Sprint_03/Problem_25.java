package Patterns_Problems_B;

public class Problem_25 {
    public static void main(String[] args) {

        int rows=3;
        int columns=4;
        int no=1;

        int [][] arr=new int [rows][columns];

        for(int i=0;i<rows;i++){
            if(i%2==0) {
                for (int j = 0; j < columns; j++) {
                    arr[i][j] = no;
                    no++;
                }
            }
                else{
                    for(int j=columns-1;j>=0;j--){
                        arr[i][j]=no;
                        no++;
                    }
                }
            }

        for(int i=0;i<rows;i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        }

    }
