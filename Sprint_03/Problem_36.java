package Patterns_Problems_B;

public class Problem_36 {
    public static void main(String[] args) {

        char [][] arr=new char[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                if((i+j)%2==0){
                    arr[i][j]='X';
                }
                else{
                    arr[i][j]='O';
                }

            }
        }


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
