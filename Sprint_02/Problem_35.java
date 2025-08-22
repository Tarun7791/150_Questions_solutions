package Sprint_02;

public class Problem_35 {
    public static void main(String[] args) {

        int[][] arr=new int[4][4];

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){

                if(j<=i){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
        }

        for(int m=0;m<4;m++){
            for(int o=0;o<4;o++){

                System.out.print(arr[m][o]+" ");

            }
            System.out.println();
        }

    }
}
