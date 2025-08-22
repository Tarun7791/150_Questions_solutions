package Patterns_Problems_B;
public class Problem_35 {
    public static void main(String[] args) {

        int no1=1;
        int no2=1;

        int[][]arr=new int[3][3];

        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){

                if(i==j){
                    arr[i][j]=no1;
                    no1=no1+4;
                }
                else{
                    arr[i][j]=no2;
                }

                no2++;

            }
        }

        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
